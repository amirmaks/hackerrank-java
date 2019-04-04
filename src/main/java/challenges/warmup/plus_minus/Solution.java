package challenges.warmup.plus_minus;

import java.util.Scanner;

public class Solution {
    static void plusMinus(int[] arr) {
        int p = 0;
        int n = 0;
        int z = 0;

        for (int e: arr) {
            if (e > 0) p++;
            else if(e < 0) n++;
            else z++;
        }

        float[] results = {
            (float) p / arr.length,
            (float) n / arr.length,
            (float) z / arr.length
        };

        for (float e: results) {
            System.out.printf("%.6f \n", e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
        }

//        int[] ar = {-4, 3, -9, 0, 4, 1 };
        plusMinus(arr);
    }
}
