package services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import models.GoodStudent;
import models.NormalStudent;
import models.StuDto;
import models.Student;
import repository.ConnectionUtils;

import static controllers.MainController.*;

public class StudentService {

	public static void funRecruitment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong can tuyen:");
		int n = sc.nextInt();
		if (n < listGoodStudent.size()) {
			Collections.sort(listGoodStudent, new Comparator<GoodStudent>() {
				@Override
				public int compare(GoodStudent std1, GoodStudent std2) {
					int value1 = std1.getDoB().compareTo(std2.getDoB());
//					int value1 = Double.compare(std2.getGpa(),std1.getGpa());

					if (value1 == 0) {
						return   std1.getFullName().compareTo(std2.getFullName());
//						return std1.getFullName().compareTo(std2.getFullName());
					}
					return value1;
				}
			});
			
			for (int i=0;i<n;i++) {
	            System.out.println(listGoodStudent.get(i).ShowMyInfor());
	        }
			
		}else {
			Collections.sort(listNormailStudent, new Comparator<NormalStudent>() {
				@Override
				public int compare(NormalStudent std1, NormalStudent std2) {
					int value1 = Double.compare(std2.getEntryTestScore(),std1.getEntryTestScore());
					if (value1 == 0) {
						return  Double.compare(std2.getEnglishScore(),std1.getEnglishScore());
					}
					return value1;
				}
			});
			for(GoodStudent student: listGoodStudent) {
	            System.out.println(student.ShowMyInfor());
			}
			for (int i=0;i<n-listGoodStudent.size();i++) {
	            System.out.println(listNormailStudent.get(i).ShowMyInfor());
	        }
		}
	}
	
	public static void getAllCustomer() throws SQLException{
		List<StuDto> lists=new ArrayList<StuDto>();
		String sql = "SELECT fullName,phoneNumber FROM Student";
		Connection connection = null;
		Statement statement=null;
		ResultSet result=null;
		try {
			connection = ConnectionUtils.getConnection();
			statement = connection.createStatement();
			result = statement.executeQuery(sql);
			while (result.next()) {
				StuDto std=new StuDto();
				std.setFullName(result.getString("fullName"));
				std.setPhoneNumber(result.getString("phoneNumber"));
                lists.add(std);
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
		
		for(StuDto std:lists) {
			System.out.println(std.getFullName()+' '+std.getPhoneNumber());
		}
	}
}
