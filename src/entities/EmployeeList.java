package entities;

public class EmployeeList {
	
	private int id;
	private String name;
	private double salary;
	
	public EmployeeList() {
	}
	
	public EmployeeList(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double porcentage) {
		double money = this.salary * (porcentage / 100 );
		this.salary += money;
	}
	
	public String toString() {
		return "id: " + id + ", nome: " + name + ", salario: " + salary;
	}
}
