package aplication;

import java.util.Locale;

import entities.AccountBusinessH;
import entities.AccountH;
import entities.SavingsAccountH;

public class ProgramHe {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		AccountH acc = new AccountH(1001, "alex", 1000.0);
		AccountBusinessH bacc = new AccountBusinessH(1002, "Maria", 0.0, 500.0);
		
		//Upcasting
		AccountH acc1 = bacc;
		AccountH acc2 = new AccountBusinessH(1003, "Bob", 0.0, 200.0);
		AccountH acc3 = new SavingsAccountH(1004, "Anna", 1000.0, 0.01);
		
		//DownCasting
			//Para o downCasting forçado é necessário "instânciar" a subclasse que será usada
		AccountBusinessH acc4 = (AccountBusinessH)acc2;
		acc4.loan(100.0);
		
		// método instanceof usado para verificar se o objeto está devidamente instanciado 
		/*
		if(acc3 instanceof AccountBusinessH) {
			AccountBusinessH acc5 = (AccountBusinessH)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccountH) {
			SavingsAccountH acc5 = (SavingsAccountH)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			System.out.println(acc5.getHolder());
		}*/
		
		acc.withDraw(50.0);
		acc3.withDraw(50.0);
		System.out.println(acc.getBalance());
		System.out.println(acc3.getBalance());
	}
}
