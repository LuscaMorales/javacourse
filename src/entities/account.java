package entities;

public class account {
	private int nconta;
	private String name;
	private double moneyadd;
	
	public account(int nconta, String name, double moneyadd) {
		this.nconta = nconta;
		this.name = name;
		this.moneyadd = moneyadd;
	}
	
	public account(int nconta, String name) {
		this.nconta = nconta;
		this.name = name;
	}
	
	public int getNconta() {
		return nconta;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance(){
		return moneyadd;
	}
	
	public void addMoney(double moneyadd) {
		this.moneyadd += moneyadd;
	}
	
	public void subMoney(double moneysub) {
		this.moneyadd -= (moneysub + 5);
	}
	
	public void bankStats() {
		System.out.printf("\nYour account has:"
				+ "\n    Main name: %s."
				+ "\n    Account Number: %d."
				+ "\n    The balance: %.2f\n",
				getName(), getNconta(), getBalance());
	}
	
}
