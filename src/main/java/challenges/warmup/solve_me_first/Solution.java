package challenges.warmup.solve_me_first;

import java.util.Scanner;

public class Solution {
    static int solveMeFirst(int a,int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }

}
