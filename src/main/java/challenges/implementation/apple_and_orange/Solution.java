package challenges.implementation.apple_and_orange;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];
        String[] orangesItems  = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);
        scanner.close();
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int[] apples_pos = new int[apples.length];

        for (int i = 0; i < apples.length; i++) {
            apples_pos[i] = a + apples[i];
        }

        int[] oranges_pos = new int[oranges.length];

        for(int i = 0; i < oranges.length; i++) {
            oranges_pos[i] = b + oranges[i];
        }

        int match_apple = 0;
        int match_orange = 0;

        for(int pos: apples_pos) {
            if (pos >= s && pos <= t) {
                match_apple++;
            }
        }

        for (int pos: oranges_pos) {
            if (pos >=s && pos <= t) {
                match_orange++;
            }
        }

        System.out.println(match_apple);
        System.out.println(match_orange);
    }
}
