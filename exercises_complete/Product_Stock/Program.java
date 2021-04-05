package exercises_complete.Product_Stock;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Produto_Estoque produto_estoque1 = new Produto_Estoque();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		produto_estoque1.name = sc.nextLine();
		System.out.print("Price: ");
		produto_estoque1.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		produto_estoque1.quantity = sc.nextInt();
			
		System.out.print("Product data: " + produto_estoque1.toString());
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produto_estoque1.AddProducts(quantity);
		System.out.print("Updated data: " + produto_estoque1);
		System.out.println();
		System.out.println("Enter the number of products to be remove in stock: ");
		quantity = sc.nextInt();
		produto_estoque1.RemoveProducts(quantity);
		System.out.print("Updated data: " + produto_estoque1);
		System.out.println();

	

	sc.close();
	}
}
