package commons;

import java.util.ArrayList;
import java.util.List;

import entities.Customer;
import entities.LineItem;
import entities.Order;
import services.CustomerService;
import services.LineItemService;
import services.OrderService;


public class SaleManagement {
	public static void main(String[] args) {
		
		try {
			//thêm customer
//			CustomerService.addCustomer(new Customer(1, "Nam"));
//			CustomerService.addCustomer(new Customer(2, "Thang"));
//			CustomerService.addCustomer(new Customer(3, "Hoa"));

			//danh sách customer
//			List<Customer> lists=new ArrayList<Customer>();
//
//			lists=CustomerService.getAllCustomer();
//			for (Customer customer2 : lists) {
//				System.out.println(customer2.toString());
//			}
			
			
			//xóa customer
//			CustomerService.deleteCustomer(1);
			
			//Update customer
//			CustomerService.updateCustomer(new Customer(2, "Manh"));
			
			
			//thêm order
//			OrderService.addOrder(new Order(1, "2020-03-20",1,1,0.0f));
//			OrderService.addOrder(new Order(2, "2020-02-15",2,2,0.0f));
//			OrderService.addOrder(new Order(3, "2020-02-27",3,4,0.0f));
//			OrderService.addOrder(new Order(4, "2020-02-22",1,3,0.0f));

			//danh sách order theo id Customer
//			List<Order> listOrder=new ArrayList<Order>();
//
//			listOrder=OrderService.getAllOrdersByCustomerId(1);
//			for (Order order : listOrder) {
//				System.out.println(order.toString());
//			}
			
			//update total order
//			OrderService.updateOrderTotal(1);
			
			//danh sách lineItem theo id order
//			List<LineItem> listLineItem=new ArrayList<LineItem>();
//
//			listLineItem=LineItemService.getAllItemsByOrderId(1);
//			for (LineItem item : listLineItem) {
//				System.out.println(item.toString());
//			}
			
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
