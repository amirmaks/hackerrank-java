package challenges.warmup.simple_array_sum;

import java.util.Scanner;

public class Solution {

    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int e: ar) {
            sum+=e;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        int[] ar = new int[l];
        int i = 0;
        for (String e: scanner.nextLine().split(" ")) {
            ar[i++] = Integer.parseInt(e);
        }
        int sum = simpleArraySum(ar);
        System.out.println(sum);
    }

}
