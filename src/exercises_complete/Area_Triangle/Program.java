package exercises_complete.Area_Triangle;


import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a= sc.nextDouble();
		x.b= sc.nextDouble();
		x.c= sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a= sc.nextDouble();
		y.b= sc.nextDouble();
		y.c= sc.nextDouble();
		

		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areax);
		System.out.printf("Triangle X area: %.4f%n", areay);	
		
		if (areax > areay) {
			System.out.println("Larger area: X");
		}
		else if(areax < areay){
			System.out.println("Larger area: Y");
		}
		else {
			System.out.println("X = Y");
		}
		
		
		
		sc.close();
	}

}
