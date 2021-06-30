package commons;

import java.io.IOException;
import java.util.regex.Pattern;

public class StudentException {
	
	public static void InvalidFullNameException(String name) throws Exception {
		if(name.length()>50) {
            throw new IOException();
		}
		
        if (!Pattern.matches("^[A-Z]([a-z]?)+(\\s[A-Z]([a-z]?)+)?+", name)) {
            throw new IOException();
        }
    }
	
	public static void InvalidDOBException(String date) throws Exception {
		
        if (!Pattern.matches("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", date)) {
            throw new IOException();
        }
    }
	
	public static void InvalidPhoneNumberException(String phone) throws Exception {
        if (!Pattern.matches("^(090|098|091|031|035|038)[0-9]{7}$", phone)) {
            throw new IOException();
        }
    }
}
