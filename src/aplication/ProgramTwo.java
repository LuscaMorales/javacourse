package aplication;

import java.util.Scanner;

import entities.employee;

public class ProgramTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		employee lucas = new employee();
		
		System.out.print("Enter the name of employee");
		lucas.name = sc.nextLine();
		System.out.print("Enter the Gross Salary of employee");
		lucas.gSalary = sc.nextDouble();
		System.out.print("Enter the tax Gross Salary of employee");
		lucas.tax = sc.nextDouble();

		lucas.ShowStats();
		
		double Increase;
		System.out.print("\n\nEnter the tax to increase of Gross Salary");
		Increase = sc.nextDouble();
		lucas.IncreaseSalary(Increase);
		lucas.ShowStats();
		
		
		
		
		sc.close();
	}

}
