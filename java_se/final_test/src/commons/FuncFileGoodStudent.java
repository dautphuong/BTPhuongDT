package commons;

import models.GoodStudent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class FuncFileGoodStudent {
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String fileGoodStudent = "src/data/goodStudent.csv";
	// header file CSV Customer
	private static final String FILE_HEADER_CUSTOMER = "fullName,doB,sex,phoneNumber,universityName,gradeLevel,gpa,bestRewardName";


	public static ArrayList<GoodStudent> getFileCSVToListStudent() {
		BufferedReader br = null;
		ArrayList<GoodStudent> listGoodStudent = new ArrayList<>();
		// doc file goodStudent.csv
		// tạo file nếu chưa tồn tại
		Path pathStudent = Paths.get(fileGoodStudent);

		if (!Files.exists(pathStudent)) {
			try {
				Writer writer = new FileWriter(fileGoodStudent);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		try {
			String line;
			br = new BufferedReader(new FileReader(fileGoodStudent));
			while ((line = br.readLine()) != null) {
				String[] splitdata = line.split(",");
				if (splitdata[0].equals("fullName")) {
					continue;
				}
				GoodStudent goodStudent = new GoodStudent();
				goodStudent.setFullName(splitdata[0]);
				goodStudent.setDoB(new SimpleDateFormat("dd/MM/yyyy").parse(splitdata[1]));
				goodStudent.setSex(splitdata[2]);
				goodStudent.setPhoneNumber(splitdata[3]);
				goodStudent.setUniversityName(splitdata[4]);
				goodStudent.setGradeLevel(splitdata[5]);
				goodStudent.setGpa(Double.parseDouble(splitdata[6]));
				goodStudent.setBestRewardName(splitdata[7]);
				listGoodStudent.add(goodStudent);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return listGoodStudent;
	}
	
}
