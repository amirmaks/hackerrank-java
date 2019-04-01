package hackerearth.alghoritms.sorting.bubble_sort;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] A = {7, 4, 5, 2};
        process(A, A.length);
    }

    public static void process(int[] A, int n) {
        int temp;

        for (int k = 0; k < n - 1; k++) {
            for (int i = 0; i < n - k - 1; i++) {
                if (A[i] > A[i+1]) {
                    temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(A));
    }
}
