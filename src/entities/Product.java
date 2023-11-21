package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	//public double totalValue;
	
	public Product() {
		
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int quantity() {
		return quantity;
	}
	
	public double TotalValueStock(){
		//this.totalValue = quantity * price;
		//System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f", name, price, quantity, totalValue);
		return price * quantity;
	}
	
	public void AddProduct(int AddQuantity){
		this.quantity += AddQuantity;
		//this.totalValue = quantity * price;
		//System.out.printf("Update data: %s, $ %.2f, %d units, Total: %.2f", name, price, quantity, totalValue);
	}

	public void RemoveProduct(int SubProduct) {
		this.quantity -= SubProduct;
		//this.totalValue = quantity * price;
		//System.out.printf("Update data: %s, $ %.2f, %d units, Total: %.2f", name, price, quantity, totalValue);
	}
	
	public String toString(){
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, total: $ " 
			+ String.format("%.2f", TotalValueStock());
	}
}