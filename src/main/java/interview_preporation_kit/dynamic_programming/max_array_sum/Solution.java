package interview_preporation_kit.dynamic_programming.max_array_sum;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 4, 5};

        System.out.println(
                maxSubsetSum(arr)
        );
    }

    public static int maxSubsetSum(int[] arr) {

        arr[0] = Math.max(0, arr[0]);
        arr[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {

            arr[i] = Math.max(
                    arr[i-1],
                    arr[i] + arr[i-2]
            );

            System.out.println();

        }
        return arr[arr.length-1];
    }
}
