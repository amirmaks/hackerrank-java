package thirty_days_of_code.regex_patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Soluition {
    private static final Scanner scanner = new Scanner(System.in);
    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];


            if (emailID.matches(".*@gmail.com$")) {
                list.add(firstName);
            }
        }

        Collections.sort(list);

        for (String i: list) {
            System.out.println(i);
        }


        scanner.close();
    }
}
