package hackerearth.alghoritms.sorting.selection_sort;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
//        int[] A = {7,5,4,2};
        int[] A = {
                84,
                89,
                32,
                27,
                47,
                100,
                33,
                100,
                77,
                43,
                78,
                51,
                47,
                61,
                53,
                57,
                45,
                37,
                67,
                45,
                36,
                44,
                80,
                47,
                12,
                11,
                98,
                40,
                80,
                21,
                50,
                40,
                11,
                13,
                56,
                49,
                38,
                69,
                16,
                26,
                28,
                27,
                92,
                81,
                13,
                68,
                85,
                85,
                13,
                23,
                31,
                56,
                19,
                94,
                76,
                79,
                11,
                97,
                46,
                78,
                22,
                5,
                61,
                78,
                1,
                41,
                14,
                17,
                34,
                16,
                1,
                49,
                32,
                13,
                47,
                67,
                34,
                65,
                3,
                51,
                53,
                81,
                65,
                85,
                73,
                63,
                22,
                91,
                52,
                84,
                100,
                43,
                46,
                77,
                10,
                100,
                56,
                16,
                8,
                25
        };

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
