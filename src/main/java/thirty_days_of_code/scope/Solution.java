package thirty_days_of_code.scope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int offset = 0;
        ArrayList<Integer> diffs = new ArrayList<Integer>();

        while (offset < this.elements.length - 1) {
            for (int i = offset + 1; i <= this.elements.length - 1; i++) {
                int diff = this.elements[offset] - this.elements[i];
                if (diff < 0) {
                    diff = Math.abs(diff);
                }
                diffs.add(diff);
            }
            ++offset;
        }

        this.maximumDifference = Collections.max(diffs);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.println(difference.maximumDifference);
    }
}
