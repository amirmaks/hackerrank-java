package challenges.warmup.compare_the_triplets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int countA = 0;
        int countB = 0;

        for (int i = 0; i <= 2; i++) {
            if (a.get(i) > b.get(i)) {
                countA++;
            } else if (a.get(i) < b.get(i)) {
                countB++;
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        result.add(countA);
        result.add(countB);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aItems = scanner.nextLine();
        String bItems = scanner.nextLine();

        List<Integer> a = new ArrayList<Integer>();
        for (String e : aItems.split(" ")) {
            a.add(Integer.parseInt(e));
        }

        List<Integer> b = new ArrayList<Integer>();
        for (String e : bItems.split(" ")) {
            b.add(Integer.parseInt(e));
        }

        List<Integer> result = compareTriplets(a, b);

        for (int e: result) {
            System.out.println(e);
        }
    }
}
