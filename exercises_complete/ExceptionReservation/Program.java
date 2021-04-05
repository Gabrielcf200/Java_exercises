package exercises_complete.ExceptionReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
			System.out.print("Room number: ");
			Integer roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(sc.next());
			
			
			Reservation reservartion = new Reservation(roomNumber, checkin, checkout);
			System.out.printf("Reservation: " + reservartion + "%n");
			
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());
			reservartion.updataDates(checkin, checkout);
			System.out.printf("Update reservartion: " + reservartion + "%n");
			sc.close();
		}catch (DomainException de) {
			System.out.println("Erro in reservation: " + de.getMessage());
		}
		catch (ParseException pe) {
			System.out.println("Invalid date format");
		}catch (Exception e) {
			System.out.println("Exception");
		}
			
		
	}
}
