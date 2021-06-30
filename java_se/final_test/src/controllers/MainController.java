package controllers;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import commons.FuncFileGoodStudent;
import commons.FuncFileNormalStudent;
import models.GoodStudent;
import models.NormalStudent;
import repository.ConnectionUtils;
import services.goodStudentService;
import services.normalStudentService;
import static commons.StudentException.*;
import static services.StudentService.*;
public class MainController {
	public static ArrayList<GoodStudent> listGoodStudent = new ArrayList<>();
	public static ArrayList<NormalStudent> listNormailStudent = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		// doc file
		listGoodStudent = FuncFileGoodStudent.getFileCSVToListStudent();
		listNormailStudent = FuncFileNormalStudent.getFileCSVToListStudent();

		//ghi file vao database
//		for(GoodStudent goodStudent:listGoodStudent) {
//			goodStudentService.addStudent(goodStudent);
//		}
//		for(NormalStudent normalStudent:listNormailStudent) {
//			normalStudentService.addStudent(normalStudent);
//		}
		
		//test validator
//		Scanner scanner=new Scanner(System.in);
//		try {
//            System.out.print("Enter Date : ");
//            InvalidDOBException(scanner.next());
//            System.out.println("ok");
//        } catch (Exception e) {
//            System.out.println("Date sai định dạng");
//        }
		
		
		//sort
//		funRecruitment();
		//getAll
		getAllCustomer() ;
		
//		Connection connection = null;
//		connection = ConnectionUtils.getConnection();

	}
}
