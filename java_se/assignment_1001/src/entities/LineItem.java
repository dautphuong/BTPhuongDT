package entities;

public class LineItem {
	int order_id;
	int product_id;
	int quantity;
	float price;
	
	public LineItem() {
		super();
	}

	public LineItem(int order_id, int product_id, int quantity, float price) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.price = price;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order{orderId : "+this.getOrder_id()+
				", productId : "+this.getProduct_id()+
				", quantity : "+this.getQuantity()+
				", price : "+this.getPrice()+
				"}"; 
	}
	
}
