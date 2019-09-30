package interview_preporation_kit.greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class luck_balance {
    public static void main(String args[]) {
        int k = 3;

        int[][] contests = new int[6][2];

        contests[0][0] = 5;
        contests[0][1] = 1;

        contests[1][0] = 2;
        contests[1][1] = 1;

        contests[2][0] = 1;
        contests[2][1] = 1;

        contests[3][0] = 8;
        contests[3][1] = 1;

        contests[4][0] = 10;
        contests[4][1] = 0;

        contests[5][0] = 5;
        contests[5][1] = 0;

        int sumUnimportant = 0;
        int sumImportant = 0;

        ArrayList<Integer> importantValuesList = new ArrayList<Integer>();

        for (int i = 0; i < contests.length; i++) {
            int value = contests[i][0];
            int importance = contests[i][1];

            if (importance == 1) {
                importantValuesList.add(value);
                sumImportant += value;
            }

            if (importance == 0) {
                sumUnimportant += value;
            }
        }

        int haveToWin = 0;

        if (k < importantValuesList.size()) {
            haveToWin = importantValuesList.size() - k;
        }

        if (haveToWin == 0) {
            System.out.println(sumUnimportant + sumImportant);
            return;
        }

        int[] importantValuesArr = new int[importantValuesList.size()];

        for (int i = 0;i < importantValuesList.size(); i++) {
            importantValuesArr[i] = importantValuesList.get(i);
        }

        Arrays.sort(importantValuesArr);

        sumImportant = 0;

        for (int i = haveToWin; i < importantValuesArr.length; i++) {
            sumImportant += importantValuesArr[i];
        }

        for (int i = 0; i < haveToWin; i++) {
            sumImportant -= importantValuesArr[i];
        }

        System.out.println(sumImportant + sumUnimportant);
    }
}
