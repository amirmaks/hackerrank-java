package challenges.implementation.grading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        int[] result = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            int g = grades[i];
            if (round(g) != g && g >= 38) {
                if (round(g) - g < 3) {
                    result[i] = round(g);
                } else {
                    result[i] = g;
                }
            } else {
                result[i] = g;
            }
        }
        return result;
    }

    static int round(int n) {
        if (n % 5 == 0) return n;

        while (n % 5 != 0) {
            n++;
        }

        return n;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
