package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Customer;
import entities.LineItem;
import entities.Order;
import repository.ConnectionUtils;

public class OrderService {
	public static List<Order> getAllOrdersByCustomerId(int customerId) throws SQLException{
		
		List<Order> lists=new ArrayList<Order>();
		String sql = "SELECT * FROM Orders where customer_id="+customerId;
		Connection connection = null;
		Statement statement=null;
		ResultSet result=null;
		try {
			connection = ConnectionUtils.getConnection();
			statement = connection.createStatement();
			result = statement.executeQuery(sql);
			while (result.next()) {
                lists.add(new Order(result.getInt("order_id"),result.getString("order_date"),result.getInt("customer_id"),result.getInt("employee_id"),result.getFloat("total")));
               }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
		
		return lists;
		
	}
	
	
	public static boolean addOrder(Order order) throws SQLException {
		String sql = "Insert into Orders values(?, ?, ?, ?, ?)";
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		
		try {
			connection = ConnectionUtils.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, order.getOrder_id());
			statement.setString(2, order.getOrder_date());
			statement.setInt(3, order.getCustomer_id());
			statement.setInt(4, order.getEmployee_id());
			statement.setFloat(5, order.getTotal());

			result = statement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
		
		System.out.println("Record affect: " + result);
		return result > 0;
	}
	
	public static boolean updateOrderTotal(int orderId) throws SQLException {
		String sql = "Update Orders set total=? where order_id=?";
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		try {
			connection = ConnectionUtils.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(2, orderId);
			statement.setFloat(1,LineItemService.computeOrderTotal(orderId));
			result = statement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
		
		System.out.println("Record affect: " + result);
		return result > 0;
	}
}
