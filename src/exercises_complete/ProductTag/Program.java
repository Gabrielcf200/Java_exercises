package exercises_complete.ProductTag;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> listProduct = new ArrayList<>();
		
		
		System.out.println("Entre com a quantidade de produtos: ");
		int quantityproduct = sc.nextInt();
		for (int i=1; i<= quantityproduct;i++) {
			System.out.printf("Produto #" +i + "%nComum, usado, importado(c,u,i)?");
			String x = sc.next();
			char cui = x.toLowerCase().charAt(0);
			if (cui == 'c') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				listProduct.add(new Product(name, price));
	
			}else if(cui == 'u'){
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				listProduct.add(new UsedProduct(name, price, date));
			} else if (cui == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				Double customsfee = sc.nextDouble();
				listProduct.add(new ImportedProduct(name, price, customsfee));
			} else {
				System.out.println("Erro!");
				System.exit(0);
			}
		}
		System.out.printf("%nPRICE TAGS: %n");
		for (Product pdc: listProduct) {
			pdc.priceTag();
		}
	
		sc.close();
	}
}
