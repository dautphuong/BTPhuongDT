package models;

import java.util.Date;

public abstract class Student {
	String fullName;
	Date doB;
	String sex;
	String phoneNumber;
	String universityName;
	String gradeLevel;

	public Student() {
		super();
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDoB() {
		return doB;
	}

	public void setDoB(Date doB) {
		this.doB = doB;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public String ShowMyInfor() {
		return "fullName='" + getFullName() + '\'' + ", doB='" + getDoB() + '\'' + ", sex='" + getSex() + '\''
				+ ", phoneNumber='" + getPhoneNumber() + '\'' + ", universityName='" + getUniversityName() + '\''
				+ ", gradeLevel='" + getGradeLevel();
	}
}
