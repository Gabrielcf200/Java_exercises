package exercises_complete.LambdaEmployee2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		List<Employee> list = new ArrayList<>();
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] employee = line.split(",");
				list.add(new Employee(employee[0],employee[1], Double.parseDouble(employee[2])));
				line = br.readLine();
			}
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			Comparator<Employee> comp =  (s1,s2) -> s1.getName().toUpperCase().compareTo(s2.getName().toUpperCase());
			List<String>  email = list.stream().filter(p -> p.getSalary() > salary).sorted(comp).map(x -> x.getEmail()).collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + salary + ":");
			email.forEach(System.out::println);
			
			double sum = list.stream().filter(p -> p.getName().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
		}catch(IOException e) {e.getStackTrace();}
		
		sc.close();
	}
}
