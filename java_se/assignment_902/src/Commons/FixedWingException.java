package Commons;

import java.io.IOException;
import java.util.regex.Pattern;

public class FixedWingException {
    public static void idException(String idFixed) throws Exception {
        if (!Pattern.matches("(^FW[\\d]{5})", idFixed)) {
            throw new IOException();
        }
    }

    public static void typeException(String type) throws Exception {
        if (!Pattern.matches("(CAG|LGR|PRV|)", type)) {
            throw new IOException();
        }
    }


}
