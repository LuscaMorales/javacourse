package Aplications;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import modal.entities.reservation;

public class Programs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate checkin;
		checkin = LocalDate.parse(sc.nextLine(), fmt1);
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate checkout;
		checkout = LocalDate.parse(sc.nextLine(), fmt1);
		
		if(!checkout.isAfter(checkin)) {
			System.out.println("Error in reservation : Check-Out date must be after check-in Date");
		}else {
			reservation rev = new reservation(number, checkin, checkout);
			System.out.println("Reservation: " + rev);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.nextLine(), fmt1);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.nextLine(), fmt1);
			
			String error = rev.updateDates(checkin, checkout);
			if(error != null) {
				System.out.println("Error in reservation: " + error);
			}else {
				System.out.println("Reservation: " + rev);
			}
							
		}
		
		sc.close();
	}

}
