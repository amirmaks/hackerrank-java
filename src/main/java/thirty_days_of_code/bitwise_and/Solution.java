package thirty_days_of_code.bitwise_and;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            process(n, k);
        }

        scanner.close();
    }

    public static void process(int n, int k) {
        int pivot = 1;
        int max = 0;

        while (pivot < n) {
            for (int i = pivot; i < n; i++) {
                int next = i + 1;
                int result = pivot & next;
                if (result > max && result < k) {
                    max = result;
                }
            }
            pivot++;
        }

        System.out.println(max);
    }
}
