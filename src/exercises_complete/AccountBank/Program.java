package exercises_complete.AccountBank;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		double valor;
		int conta;
		String nome;
		String p;
		char t;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		conta = sc.nextInt();
		
		System.out.print("Enter account holder: " );
		nome = sc.next();
		

		Account conta1 = new Account(conta, nome);
		
		System.out.print("Is there na initial deposit? ");
		p  = sc.nextLine();
		t = p.toLowerCase().charAt(0);
		if ( t == 's') {
			System.out.print("Enter initial deposit value: ");
			valor = sc.nextDouble();
			conta1.DepositoConta(valor);
		}		
		
		System.out.printf("%nAccount data:%nAccount " + conta1.getNumeroconta() + ", Holder " + conta1.getNomeconta().toUpperCase() + ", Balance " + conta1.getValorconta());
		
		
		System.out.printf("%n%nEnter a deposit value: ");
		valor = sc.nextDouble();
		conta1.DepositoConta(valor);
		System.out.printf(conta1.toString());
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();
		conta1.SacarConta(valor);
		System.out.printf(conta1.toString());
		
		sc.close();
	
	}


}
