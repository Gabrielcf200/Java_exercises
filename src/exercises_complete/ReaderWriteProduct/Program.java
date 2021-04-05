package exercises_complete.ReaderWriteProduct;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

		String []produtos = new String[4];
		List<Product> list = new ArrayList<>();
		
		
		
		System.out.println("Digite o caminho que deseja adicionar seus produtos: ");
		String path = sc.nextLine();
		System.out.println("Digite o nome do arquivo:  ");
		String fileName = sc.nextLine();
		
		for(int i=0; i<4; i++) {
			System.out.println("Digite o produto, preço e a unidade: ");
			produtos[i] = sc.nextLine();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\" + fileName + ".csv"))) {;
		for ( String produto: produtos) {			
			bw.write(produto);
			bw.newLine();
		}
		}catch(IOException e) {e.getMessage();}
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path + "\\" + fileName + ".csv"))){
				String produto = br.readLine();
				while(produto != null) {
					String []summary = produto.split(",");
					
					String name = summary[0];
					 Double price = Double.parseDouble(summary[1].replace(",", "."));
					 Integer quantity = Integer.parseInt(summary[2].replace(",", "."));	
										
					list.add(new Product(quantity, price, name));
					produto = br.readLine();
					
					
				}
		}catch(IOException E) {}
		
		new File(path + "\\out").mkdir();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\out" + "\\Summary.csv"))) {;
		for (Product produto: list) {			
			bw.write(produto.getName() + "," +  nf.format(produto.total()));
			bw.newLine();
		}
		}catch(IOException E) {}
		
		
		sc.close();
	}
}
