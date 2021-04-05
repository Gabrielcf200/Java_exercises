package exercises_complete.Area_Rectangle;

import java.util.Scanner;

public class Program {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle wight and height: ");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.println(rectangle);
		
	
		
		sc.close();
	}
}
