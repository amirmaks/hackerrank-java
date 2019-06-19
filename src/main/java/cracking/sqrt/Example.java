package cracking.sqrt;

public class Example {
    public static void main(String[] args) {
        System.out.println(
                sqrt(9)
        );
    }


    static int sqrt(int n) {
        return sqrt_helper(n, 1, n);
    }

    static int sqrt_helper(int n, int min, int max) {
        if (max < min) return -1;
        int guess = (min + max) / 2;

        if (guess * guess == n) {
            return guess;
        } else if (guess * guess < n) {
            return sqrt_helper(n, guess + 1, max);
        } else  {
            return sqrt_helper(n, min, guess - 1);
        }
    }
}
