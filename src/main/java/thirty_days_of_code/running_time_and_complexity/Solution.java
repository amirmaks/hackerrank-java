package thirty_days_of_code.running_time_and_complexity;

import java.util.Scanner;

public class Solution {
    public static boolean isPrime(int n) {

        if (n == 1) return false;
        if (n == 2) return true;

        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) return  false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            boolean p = isPrime(scanner.nextInt());
            System.out.println(p ? "Prime" : "Not prime");
        }
    }
}
