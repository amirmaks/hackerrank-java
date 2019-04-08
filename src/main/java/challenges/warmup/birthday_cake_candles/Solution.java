package challenges.warmup.birthday_cake_candles;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int pvt = ar[ar.length - 1];
        int c = 0;
        int i = ar.length - 1;

        try {
            while (ar[i] == pvt) {
                c++;
                i--;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arItems = scanner.nextLine().split(" ");
        int[] ar = new int[n];

        int i=0;
        for (String e: arItems) {
            ar[i++] = Integer.parseInt(e);
        }

//        int[] ar = new int[10000];
//        Arrays.fill(ar, 9999999);

        int res = birthdayCakeCandles(ar);
        System.out.println(res);
    }

}
