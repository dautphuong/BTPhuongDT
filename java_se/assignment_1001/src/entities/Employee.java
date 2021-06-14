	package entities;

public class Employee {
	int employee_id;
	String employee_name;
	float salary;
	int spvrId;
	
	
	public Employee() {
		super();
	}
	public Employee(int employee_id, String employee_name, float salary, int spvrId) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.salary = salary;
		this.spvrId = spvrId;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getSpvrId() {
		return spvrId;
	}
	public void setSpvrId(int spvrId) {
		this.spvrId = spvrId;
	}
	
	
}
