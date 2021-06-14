package commons;



import java.util.Scanner;
import static commons.EmployeeService.*;

public class EmployeeManagement {
	public static void main(String[] args) {
        displayMainMenu();
	}

	private static void displayMainMenu() {
		System.out.println("-----------EMPLOYEE MANAGEMENT SYSTEM-------------");
        System.out.println("1. Add and employee\n"+
                "2. Display employees\n"+
                "3. Classify employee\n"+
                "4. Search book by (department,emp'name)\n"+
                "5.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":
            	addEmployee();
                displayMainMenu();
            case "2":
            	display();
                displayMainMenu();
            case "3":
            	classifyEmployee();
                displayMainMenu();
            case "4":
            	search();
            	displayMainMenu();
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                displayMainMenu();
        }
	}
}
