package entities;

public class Order {
	int order_id  ;
	String order_date;
	int customer_id ;
	int employee_id ;
	float total ;
	
	
	public Order() {
		super();
	}
	
	
	public Order(int order_id, String order_date, int customer_id, int employee_id, float total) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.customer_id = customer_id;
		this.employee_id = employee_id;
		this.total = total;
	}


	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order{orderId : "+this.getOrder_id()+
				", orderDate : "+this.getOrder_date()+
				", total : "+this.getTotal()+
				", customer_id : "+this.getCustomer_id()+
				"}"; 
	}
}
