package exercises_complete.ArrayRoom;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int n;
		String nome;
		String email;
		int quarto ;
		boolean p;
	
		Scanner sc = new Scanner(System.in);
		Quartos []quartos = new Quartos[10];
		
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			nome = sc.next();
			System.out.print("Email: ");
			email = sc.next();
			p = false;
			while (p != true) {
				System.out.print("Room: ");
				quarto = sc.nextInt();

				if (quartos[quarto] == null) {
					quartos[quarto] = new Quartos(nome, email);
					p = true;
				} else {
					System.out.println("Quarto alugado! Por favor escolha outro");	
				}	
			}
		}
		System.out.println("Busy Rooms; ");
		for (int i=0; i < quartos.length; i++) {
			if(quartos[i] != null) {	
				System.out.println((i) + ": " + quartos[i].toString());
			}
		}
		sc.close();
	}
}
