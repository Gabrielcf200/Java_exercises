package exercises_complete.EmployeeLambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try(BufferedReader bf = new BufferedReader(new FileReader("c:\\temp\\Gabriel.txt"))){
			List<Product> list = new ArrayList<>();
			
			
			String line = bf.readLine();
			
			while(line != null) {
				String[] product = line.split(",");
				list.add(new Product(product[0], Double.parseDouble(product[1])));
				line = bf.readLine();
			}
			double media = list.stream().map(x -> x.getPrice()).reduce(0.0, (x,y) -> x + y) / list.size();
			System.out.println("Average price: " + String.format("%.2f", media));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());			
						
			List<String> names = list.stream().filter(p -> p.getPrice() < media).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());
			names.forEach(System.out::println);
		}catch (IOException e ) {e.getStackTrace();}
		sc.close();


	}

}
