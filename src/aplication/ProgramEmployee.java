package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		int id;
		double salary;
		double increment;
		int n;
		
	//	EmployeeList p1;
		List<EmployeeList> emp = new ArrayList<>();
		System.out.println("Digite quantos empregados deseja cadastrar");
		n = sc.nextInt();
		
		
		for(int x=0; x<n; x++) {
			System.out.println("Employer #" + (x + 1));
			sc.nextLine();
			System.out.println("Digite o nome do empregado: ");
			name = sc.nextLine();
			System.out.println("Digite o id do empregado: ");
			id = sc.nextInt();
			for(EmployeeList z : emp) {
				while(z.getId() == id) {
					System.out.println("Id já usado, digite novamente: ");
					id = sc.nextInt();
					}	
				}
			System.out.println("Digite o salário do empregado: ");
			salary = sc.nextDouble();
			emp.add(new EmployeeList(id, name, salary));
		}
		
		System.out.println("\n-------------------------------------------------");	
		for(EmployeeList x : emp) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("Deseja incrementar qual salário, digite o id:");
		id = sc.nextInt();
		int pos = position(emp, id);
		
		while (pos == -1) {
			System.out.println("Usuario não encontrado, digite novamente");
			id = sc.nextInt();
		}
		System.out.println("Id encontrado, quanto deseja incrementar: ");
		increment = sc.nextDouble();
		emp.get(pos).setSalary(increment);
		System.out.println("Cadastro atualizado:");
		System.out.println(emp.get(pos));
		
		sc.close();
	}
	
	public static int position(List<EmployeeList> emp, int id) {
		for(int i=0; i<emp.size(); i++) {
			if(emp.get(i).getId() == id) {
				return i;
			}
		}return -1;
	}
}
