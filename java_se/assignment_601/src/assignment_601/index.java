package assignment_601;

public class index {
	
	
	public static void main(String[] args) {
		SavingsAccount save1 = new SavingsAccount();
		SavingsAccount save2 = new SavingsAccount();
		
		save1.setSavingsBalance(2000);
		save2.setSavingsBalance(3000);
		
		save1.setAnnualInterestRate(0.04);
		save2.setAnnualInterestRate(0.04);
		
		save1.calculateMonthlyInterest();
		save2.calculateMonthlyInterest();
		System.out.println("Month 1 :");
		System.out.println("Account 1 : " + save1.getSavingsBalance());
		System.out.println("Account 2 : " + save2.getSavingsBalance());
		
		save1.setAnnualInterestRate(0.05);
		save2.setAnnualInterestRate(0.05);
		save1.calculateMonthlyInterest();
		save2.calculateMonthlyInterest();
		System.out.println("Month 2 ");
		System.out.println("Account 1 : " + save1.getSavingsBalance());
		System.out.println("Account 2 : " + save2.getSavingsBalance());
	}
}
