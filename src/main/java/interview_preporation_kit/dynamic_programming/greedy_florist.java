package interview_preporation_kit.dynamic_programming;

import java.util.Arrays;

public class greedy_florist {
    public static void main(String[] args) {
        int k = 3;
        int[] c = {1, 1, 1, 3, 5, 7, 9};
//        int[] c = {2, 5, 6};
        getMinimumCost(k, c);
    }

    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);

        int total = 0,
            i = c.length - 1,
            bought = 0;

        while (i >= 0) {

            for (int j = 0; j < k && i>= 0; j++) {
                total += (1 + bought) * c[i];
                i--;
            }
            ++bought;
        }

        return total;
    }

}
