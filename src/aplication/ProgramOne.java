package aplication;

import java.util.Scanner;
import entities.Product;

public class ProgramOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	//	Product pc;
	//	pc = new Product();
		int add, sub;
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
	//	pc.name = sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Price: ");
	//	pc.price = sc.nextDouble();
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");	
	//	pc.quantity = sc.nextInt();
	//	pc.totalValue = pc.TotalValueStock();
		int quantity = sc.nextInt();
		
		Product pc1 = new Product(name, price, quantity); 
		
		System.out.println("Product Data: " + pc1);
		
		System.out.print("\n\nEnter the number of products to be added in stock:");
		add = sc.nextInt();
		pc1.AddProduct(add);
		System.out.println("Product Data: " + pc1);

		
		System.out.print("\n\nEnter the number of products to be removed from stock:");
		sub = sc.nextInt();
		pc1.RemoveProduct(sub);
		System.out.println("Product Data: " + pc1);

	
		sc.close();
	}

}