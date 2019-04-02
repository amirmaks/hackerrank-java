package challenges.warmup.diagonal_difference;

import java.util.Scanner;

public class Solution {

    static int process(int[][] arr) {
        int lftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            lftSum += arr[i][i];
        }

        int x = arr.length - 1;
        int y = 0;

        int rgtSum = 0;
        while (x >= 0) {
            rgtSum += arr[y][x];
            y++;
            x--;
        }

        return Math.abs(lftSum - rgtSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] rowItems = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(rowItems[j]);
                arr[i][j] = arrItem;
            }
        }


//        int[][] arr = new int[3][3];
//
//        int[] ar1 = {1, 2, 3};
//        int[] ar2 = {4, 5, 6};
//        int[] ar3 = {9, 8, 9};
//
//        arr[0] = ar1;
//        arr[1] = ar2;
//        arr[2] = ar3;

        int result = process(arr);

        System.out.println(result);
    }
}
