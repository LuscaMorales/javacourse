package Aplications;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import modal.entities.reservation;
import model.exceptions.DomainException;

public class Programs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			LocalDate checkin;
			checkin = LocalDate.parse(sc.nextLine(), fmt1);
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			LocalDate checkout;
			checkout = LocalDate.parse(sc.nextLine(), fmt1);
			
			reservation rev = new reservation(number, checkin, checkout);
			System.out.println("Reservation: " + rev);
				
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.nextLine(), fmt1);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.nextLine(), fmt1);
			
			rev.updateDates(checkin, checkout);
			System.out.println("Reservation: " + rev);
		}
		catch (DateTimeParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}
