package entities;

public class Customer {
	int customerId;
	String customerName;
	
	public Customer() {
		super();
	}
	
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer{CustomerId : "+this.getCustomerId()+", CustomerName : "+this.getCustomerName()+"}"; 
	}
}
