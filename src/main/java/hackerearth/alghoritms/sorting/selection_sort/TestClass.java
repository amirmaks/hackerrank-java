package hackerearth.alghoritms.sorting.selection_sort;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] A = {7,5,4,2};
        process(A, A.length);
    }

    public static void process(int[] A, int n) {

        int minimum;
        int iterations = 0;


        for (int i = 0; i < n-1; i++) {
            minimum = i;

            for (int j = i + 1; j < n; j++) {
                if(A[j] < A[minimum]) {
                    minimum = j;
                    iterations++;
                }
            }

            int temp = A[i];

            A[i] = A[minimum];
            A[minimum] = temp;
        }

        System.out.println(Arrays.toString(A));
        System.out.println(iterations);
    }
}
