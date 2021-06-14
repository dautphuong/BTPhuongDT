package assignment_601;

public class SavingsAccount {
	double annualInterestRate;
	double savingsBalance;
	
	public SavingsAccount() {
	}
	
	public SavingsAccount(double annualInterestRate, double savingsBalance) {
		super();
		this.annualInterestRate = annualInterestRate;
		this.savingsBalance = savingsBalance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest() {
		this.savingsBalance += this.savingsBalance * this.annualInterestRate / 12;
	}
}
