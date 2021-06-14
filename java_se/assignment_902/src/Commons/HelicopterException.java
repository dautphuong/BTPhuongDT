package Commons;

import java.io.IOException;
import java.util.regex.Pattern;

public class HelicopterException {
    public static void idException(String idFixed) throws Exception {
        if (!Pattern.matches("(^RW[\\d]{5})", idFixed)) {
            throw new IOException();
        }
    }

    public static void maxWeight(double emptyWeight,double maxTakeoffWeight) throws Exception {
        if (emptyWeight*1.5<maxTakeoffWeight) {
            throw new IOException();
        }
    }
}
