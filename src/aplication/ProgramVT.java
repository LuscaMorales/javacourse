package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVt;

public class ProgramVT {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVt[] vect = new ProductVt[n];
		
		for(int i=0; i<n; i++) {
			sc.next();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVt(name, price);
		}
		
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		System.out.printf("AVERAGE PRICE: %.2f",avg);
		
		
		sc.close();
	}

}
