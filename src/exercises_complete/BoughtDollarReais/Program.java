package exercises_complete.BoughtDollarReais;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		double priceDolar; 
		double quantity;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price: ");
		priceDolar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		quantity =sc.nextDouble();
		System.out.println("Amount to be paid in reais = " + ContadorDolar.ContadoraDolar(priceDolar, quantity) );
		
	}

}
