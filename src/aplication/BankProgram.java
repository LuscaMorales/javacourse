package aplication;

import java.util.Scanner;

import entities.account;

public class BankProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int nconta;
		double money;
		char x;
		
		//account ac1 = new account(177966, "Lucas Moraes", 100.50);
		//account ac2 = new account(457852, "Joao Paulo", 200);
		account ac3;
		
		System.out.print("Enter account holder: ");
		name = sc.nextLine();
		
		System.out.print("Enter account number: ");
		nconta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Is there an inicial deposit (y/n)");
		x = sc.next().charAt(0);
		
		while(x != 'y' && x != 'n' ) {
			System.out.println("Invalid Comand");
			System.out.print("Is there an inicial deposit (y/n)");
			x = sc.next().charAt(0);
		}
		
		if(x == 'y'){
			System.out.println("Enter inicial deposit value: ");
			money = sc.nextDouble();
			ac3 = new account(nconta, name, money);
			ac3.bankStats();
		}else {
			ac3 = new account(nconta, name);
			ac3.bankStats();
		}
			
		System.out.println("Enter a deposit value: ");
		money = sc.nextDouble();
		ac3.addMoney(money);
		ac3.bankStats();
		
		System.out.println("Enter a withdraw value: ");
		money = sc.nextDouble();
		ac3.subMoney(money);
		ac3.bankStats();
		
		sc.close();
	}

}
