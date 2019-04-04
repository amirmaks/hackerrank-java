package challenges.warmup.mini_max_sum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
        }
        process(arr);
    }

    static void process(int[] arr) {
        long[] sums = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            long s = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    s += arr[j];
                }
            }
            sums[i] = s;
        }

        Arrays.sort(sums);

        System.out.println(sums[0] + " " + sums[sums.length - 1]);
    }
}
