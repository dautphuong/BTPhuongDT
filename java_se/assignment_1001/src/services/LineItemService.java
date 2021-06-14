package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.LineItem;
import repository.ConnectionUtils;

public class LineItemService {
	
	public static List<LineItem> getAllItemsByOrderId(int orderId) throws SQLException{
		List<LineItem> lists=new ArrayList<LineItem>();
		String sql = "SELECT * FROM LineItem where order_id="+orderId;
		Connection connection = null;
		Statement statement=null;
		ResultSet result=null;
		try {
			connection = ConnectionUtils.getConnection();
			statement = connection.createStatement();
			result = statement.executeQuery(sql);
			while (result.next()) {
                lists.add(new LineItem(result.getInt("order_id"),result.getInt("product_id"),result.getInt("quantity"),result.getFloat("price")));
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
	
	public static float computeOrderTotal(int orderId) throws SQLException {
		List<LineItem> lists=new ArrayList<LineItem>();
		lists=getAllItemsByOrderId(orderId);
		float total=0;
		for (LineItem lineItem : lists) {
			total+=lineItem.getQuantity()*lineItem.getPrice();
		}
		return total;
	}
	
	public static boolean addLineItem(LineItem item) throws SQLException {
		String sql = "Insert into LineItem values(?, ?, ?, ?)";
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		
		try {
			connection = ConnectionUtils.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, item.getOrder_id());
			statement.setInt(2, item.getProduct_id());
			statement.setInt(3, item.getQuantity());
			statement.setFloat(4, item.getPrice());
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
