package services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import models.GoodStudent;
import models.NormalStudent;
import repository.ConnectionUtils;

public class normalStudentService {
	 public static boolean addStudent(NormalStudent student) throws Exception {
		String sql = "insert into Student(fullname,doB,sex,phoneNumber,universityName,gradeLevel,englishScore,entryTestScore)values(?,?,?,?,?,?,?,?)";
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
			statement.setDouble(7, student.getEnglishScore());
			statement.setDouble(8, student.getEntryTestScore());

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
