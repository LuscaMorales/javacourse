package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramCom {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter department's name: ");
		String dp_name = sc.nextLine();
		System.out.println("Enter Worker Date:");
		System.out.println("Name: ");
		String w_name = sc.nextLine();
		System.out.println("Level: ");
		String w_level = sc.nextLine();
		System.out.println("Base Salary: ");
		double w_salary = sc.nextDouble();
		
		Worker worker = new Worker(w_name, WorkerLevel.valueOf(w_level), w_salary, new Department(dp_name));
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter contrat " + (i+1) + " data");
			System.out.println("DATE (DD/MM/YYYY): ");
			sc.nextLine();
			LocalDate d01 = LocalDate.parse(sc.nextLine(), fmt1);
			System.out.println("Value per hour:");
			double valuePH = sc.nextDouble();
			System.out.println("Duration (hours):");
			int duration = sc.nextInt();
			
			HourContract contract = new HourContract(d01, valuePH, duration);
			worker.addContract(contract);
		}
		
		System.out.print("\n Enter month and year to calculate income:\n");
		System.out.println("Month: ");
		int month = sc.nextInt();
		System.out.println("Year: ");
		int year = sc.nextInt();
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment());
		System.out.println("income for 0" + month + "/" + year + " : " + String.format("%.2f",worker.income(month, year)));
		
		sc.close();
	}
}
