package challenges.warmup.a_very_big_sum;

import java.util.Scanner;

public class Solution {

    public static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for(long e: ar) {
            sum+=e;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arCount = scanner.nextInt();
        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        int i = 0;
        for(String e: arItems) {
            ar[i++] = Long.parseLong(e);
        }

        long result = aVeryBigSum(ar);
        System.out.println(result);

    }
}
