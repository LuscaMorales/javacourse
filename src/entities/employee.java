package entities;

public class employee {
	
	public String name;
	public double gSalary;
	public double tax;
	
	public double NetSalary(){
		double NetSalary = gSalary - ((gSalary * tax) / 100);
		return NetSalary;
	}
	
	public void IncreaseSalary(double Increase) {
		this.gSalary = gSalary + ((gSalary * Increase) / 100);
		
	}
	
	public void ShowStats() {
		System.out.printf("Employee: %s, $ %.2f", name, NetSalary());
	}
}
