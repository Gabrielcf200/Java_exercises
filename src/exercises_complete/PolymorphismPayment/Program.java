package exercises_complete.PolymorphismPayment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		List<Employee> listEmployee = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employees: ");
		int quantitye= sc.nextInt();
		
		for (int i=1;i<=quantitye;i++) {
			System.out.printf("Employee #" + i + " data:%nOutsourced(y/n)? ");
			String x = sc.next();
			char outsn = x.toLowerCase().charAt(0);
			
			if (outsn == 'y') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				System.out.println("Value per hour: ");
				Double valuePerHour =sc.nextDouble();
				System.out.println("Additional charge: ");
				Double addionalCharge = sc.nextDouble();
			
				listEmployee.add(new OutsourcedEmployee(name, hours, valuePerHour, addionalCharge));
			}else {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				System.out.println("Value per hour: ");
				Double valuePerHour =sc.nextDouble();
		
				listEmployee.add(new Employee(name, hours, valuePerHour));
			}	
		}
		
		System.out.println("PAYMENTS: ");
		for (int i=0; i < listEmployee.size(); i++)
			System.out.println(listEmployee.get(i).toString());	

		sc.close();
	}

}
