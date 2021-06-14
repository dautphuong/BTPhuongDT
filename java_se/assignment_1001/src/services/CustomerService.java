package services;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Customer;
import repository.ConnectionUtils;


public class CustomerService {

	public static boolean addCustomer(Customer customer) throws Exception{
		String sql = "Insert into Customer values(?, ?)";
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		
		try {
			connection = ConnectionUtils.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, customer.getCustomerId());
			statement.setString(2, customer.getCustomerName());
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
	
	public static List<Customer> getAllCustomer() throws SQLException{
		List<Customer> lists=new ArrayList<Customer>();
		String sql = "SELECT * FROM Customer";
		Connection connection = null;
		Statement statement=null;
		ResultSet result=null;
		try {
			connection = ConnectionUtils.getConnection();
			statement = connection.createStatement();
			result = statement.executeQuery(sql);
			while (result.next()) {
                lists.add(new Customer(result.getInt("customer_id"),result.getString("customer_name")));
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
	
	public static boolean deleteCustomer(int customerId) throws SQLException {
		String sql = "Delete from Customer where customer_id=?";
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		try {
			connection = ConnectionUtils.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, customerId);
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
	
	public static boolean updateCustomer(Customer customer) throws SQLException {
		String sql = "Update Customer set customer_name=? where customer_id=?";
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		try {
			connection = ConnectionUtils.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(2, customer.getCustomerId());
			statement.setString(1, customer.getCustomerName());
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
