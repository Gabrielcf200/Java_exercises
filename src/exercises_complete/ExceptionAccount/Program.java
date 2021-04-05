package exercises_complete.ExceptionAccount;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account date:");
		System.out.print("Number: ");
		Integer accountNumber = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.next();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		Account account = new Account(accountNumber, holder, balance, withdrawLimit);
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
		Double x = sc.nextDouble();
		try {
			account.withdraw(x);
			System.out.println(account.toString());
		
		} catch (AccountException AE) {
			System.out.println(AE.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		
	}
}
