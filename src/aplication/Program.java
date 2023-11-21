package aplication;

import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product pc;
		pc = new Product();
		
		System.out.println("Enter product data:\n");
		System.out.print("Name:");
		pc.name = sc.nextLine();
		System.out.print("Price: ");
		pc.price = sc.nextDouble();
		System.out.println("Quantity in stock:");	
		pc.quantity = sc.nextInt();
		
	}

}
