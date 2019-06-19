package cracking.prime;

public class Example {
    public static void main(String[] args) {
        isPrime(33);
    }

    static boolean isPrime(int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) {
                return false;
            }
        }

        return true;
    }
}
