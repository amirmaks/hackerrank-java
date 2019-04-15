package challenges.warmup.time_conversion;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String t = scanner.nextLine();
        String res = timeConversion("12:00:00PM");
        System.out.println(res);
    }

    static String timeConversion(String t) {
        String hString = t.substring(0, 2);
        int h = Integer.parseInt(hString);

        String rest = t.substring(2, 8);

        if (t.matches("[\\d|:]{8}AM$")) {
            return getHour(h) + rest;
        }

        int calcH = 24 - (12 - h);

        return  getHour(calcH) + rest;
    }

    static String getHour(int h) {

        if (h == 12) return "00";
        if (h == 24) return "12";

        String hString = Integer.toString(h);
        if (hString.length() == 1) {
            hString = "0" + hString;
        }
        return hString;
    }
}
