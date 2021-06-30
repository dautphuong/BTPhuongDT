package commons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import models.NormalStudent;

public class FuncFileNormalStudent {
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String fileURL = "src/data/normalStudent.csv";
	// header file CSV Customer
	private static final String FILE_HEADER_CUSTOMER = "fullName,doB,sex,phoneNumber,universityName,gradeLevel,englishScore,entryTestScore";

	public static ArrayList<NormalStudent> getFileCSVToListStudent() {
		BufferedReader br = null;
		ArrayList<NormalStudent> listNormalStudent = new ArrayList<>();
		// doc file normalStudent.csv
		// tạo file nếu chưa tồn tại
		Path pathStudent = Paths.get(fileURL);

		if (!Files.exists(pathStudent)) {
			try {
				Writer writer = new FileWriter(fileURL);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		try {
			String line;
			br = new BufferedReader(new FileReader(fileURL));
			while ((line = br.readLine()) != null) {
				String[] splitdata = line.split(",");
				if (splitdata[0].equals("fullName")) {
					continue;
				}
				NormalStudent normalStudent = new NormalStudent();
				normalStudent.setFullName(splitdata[0]);
				normalStudent.setDoB(new SimpleDateFormat("dd/MM/yyyy").parse(splitdata[1]));
				normalStudent.setSex(splitdata[2]);
				normalStudent.setPhoneNumber(splitdata[3]);
				normalStudent.setUniversityName(splitdata[4]);
				normalStudent.setGradeLevel(splitdata[5]);
				normalStudent.setEnglishScore(Double.parseDouble(splitdata[6]));
				normalStudent.setEntryTestScore(Double.parseDouble(splitdata[7]));
				listNormalStudent.add(normalStudent);
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
		return listNormalStudent;
	}
}
