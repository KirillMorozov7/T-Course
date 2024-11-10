package edu.hw1;
import java.util.Arrays;

public class Task6 {
    private final static String NUMBER_PATTERN = "%04d";
    public static int countK(int num) {
        if (num < 1000 || num > 9999 || allDigitsSame(num)) {
            return -1;
        }
        if (num==6174){
            return 0;
        }

        String snum = String.valueOf(num);


        return recSnum(snum);
    }

    private static boolean allDigitsSame(int num) {
        char[] digits = String.format(NUMBER_PATTERN, num).toCharArray();
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != digits[0]) {
                return false;
            }
        }
        return true;
    }
    private static String sortString(String num) {
        char[] arr = num.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    private static int recSnum(String num) {
        if (num.equals("6174")){
            return 0;
        }

        String numMin = sortString(num);
        String numMax = new StringBuilder(numMin).reverse().toString();
        String newNum = String.valueOf( Integer.parseInt(numMax) - Integer.parseInt(numMin));
        return  recSnum(newNum)+1;
    }
}
