package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.EmployeeP;
import entities.OutsourcedEmployeeP;

public class ProgramP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String yn;
		String name;
		Integer hours;
		Double valueHour, additionalCharge;
		int nEmployee;
		List<EmployeeP> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		nEmployee = sc.nextInt();
		for(int i=0;i<nEmployee;i++) {
			System.out.println("Employee " + (i+1) + "data: ");
			System.out.println("Outsourced (y/n)? ");
			sc.nextLine();
			yn = sc.nextLine();			
			System.out.println("Name: ");
			name = sc.nextLine();
			System.out.println("Hours: ");
			hours = sc.nextInt();
			System.out.println("Value per hour: ");
			valueHour = sc.nextDouble();
			if(yn.charAt(0) == 'y') {
				System.out.println("Additional Charge");
				additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployeeP(name, hours, valueHour, additionalCharge));
			}else {
				list.add(new EmployeeP(name, hours, valueHour));
			}
		}
		for(EmployeeP obj : list) {
			System.out.println(obj.getName() + " = " + obj.payment());
		}
		
		sc.close();
	}
}