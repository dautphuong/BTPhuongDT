package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import models.GoodStudent;
import repository.ConnectionUtils;

public class goodStudentService {
	
	//them vao database
	public static boolean addStudent(GoodStudent student) throws Exception {
		String sql = "insert into Student(fullname,doB,sex,phoneNumber,universityName,gradeLevel,gpa,bestRewardName)values(?,?,?,?,?,?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		

		try {
			connection = ConnectionUtils.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, student.getFullName());
			statement.setDate(2, new java.sql.Date(student.getDoB().getTime()));
			statement.setString(3, student.getSex());
			statement.setString(4, student.getPhoneNumber());
			statement.setString(5, student.getUniversityName());
			statement.setString(6, student.getGradeLevel());
			statement.setDouble(7, student.getGpa());
			statement.setString(8, student.getBestRewardName());

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

		return result > 0;
	}
	
	
	
}
