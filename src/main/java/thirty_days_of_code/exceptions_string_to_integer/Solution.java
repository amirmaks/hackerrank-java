package thirty_days_of_code.exceptions_string_to_integer;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int result = Integer.parseInt(S);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
