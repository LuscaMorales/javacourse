package entities;

//public final class, o final serve para não ser sobreposto, seja métodos ou classes
public class SavingsAccountH extends AccountH{
	
	private Double interestRate;
	
	public SavingsAccountH() {
		super();
	}

	public SavingsAccountH(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance - interestRate;
	}
	
	//Override serve para indicar que o método foi sobreposto
	@Override
	public void withDraw(double amount) {
		balance -= amount;
	}
	
}
