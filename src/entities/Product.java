package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	double totalValue = (price * quantity);

	
	public double TotalValueStock(){
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f", name, price, quantity, totalValue);
		return totalValue;
	}
	
	public void AddProduct(int AddQuantity){
		quantity = quantity + AddQuantity;
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f", name, price, quantity, totalValue);
	}

	public void RemoveProduct(int SubProduct) {
		quantity -= SubProduct;
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f", name, price, quantity, totalValue);
	}
}
