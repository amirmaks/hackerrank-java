//https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/

package challenges.greedy_alghoritms.minimum_absolute_difference_in_an_array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        Arrays.sort(arr);

        int min = Math.abs(arr[1] - arr[0]);

        for (int i = 1; i < arr.length - 1; i++) {
            int abs = Math.abs(arr[i + 1] - arr[i]);
            if (abs < min) {
                min = abs;
            }
        }

        System.out.println(min);
    }

}
