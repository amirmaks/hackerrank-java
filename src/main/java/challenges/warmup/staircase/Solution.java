package challenges.warmup.staircase;

import java.util.Scanner;

public class Solution {
    static void process(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            str.append("#");
            for (int j = 0; j < i; j++) {
                str.append("#");
            }
            System.out.printf("%"+n+"s%n", str);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        process(n);
    }
}
