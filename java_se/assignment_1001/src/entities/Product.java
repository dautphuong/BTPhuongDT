package entities;

public class Product {
	int product_id  ;
	String product_name ;
	float list_price ;
	public Product() {
		super();
	}
	public Product(int product_id, String product_name, float list_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.list_price = list_price;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getList_price() {
		return list_price;
	}
	public void setList_price(float list_price) {
		this.list_price = list_price;
	}
	
	
}
