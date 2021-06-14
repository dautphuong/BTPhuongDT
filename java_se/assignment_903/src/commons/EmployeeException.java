package commons;

import java.io.IOException;
import java.util.regex.Pattern;

public class EmployeeException {
	public static void phoneException(String phone) throws Exception {
        if (!Pattern.matches("(^[\\d]{7}+)", phone)) {
            throw new IOException();
        }
    }
	public static void birthDateException(String birthDate) throws Exception {
        
    }
	public static void emailException(String email) throws Exception {
		if (!Pattern.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", email)) {
            throw new IOException();
        }
    }
}
