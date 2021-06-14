package Commons;

import java.io.IOException;
import java.util.regex.Pattern;

public class AirplaneException {
    public static void idException(String idFixed) throws Exception {
        if (!Pattern.matches("(^AP[\\d]{5})", idFixed)) {
            throw new IOException();
        }
    }

    public static void sizeException(double runwaySizeAirplane,double minRunwayFixed) throws Exception {
        if (runwaySizeAirplane<minRunwayFixed) {
            throw new IOException();
        }
    }
}
