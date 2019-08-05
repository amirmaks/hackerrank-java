package interview_preporation_kit.dynamic_programming.abbreviation;

public class Solution {
    public static void main(String[] args) {
        String a=  "ABcdE";
        String b= "ABDE";

        boolean[][] dp = new boolean[a.length() + 1][b.length() + 1];
        dp[0][0] = true;

        for (int i= 0; i < a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (dp[i][j]) {
                    if (
                        j < b.length() &&
                        (Character.toUpperCase(a.charAt(i)) == b.charAt(j))
                    ) {
                        dp[i + 1][j + 1] = true;
                    }

                    if (!Character.isUpperCase(a.charAt(i))) {
                        dp[i + 1][j] = true;
                    }
                }
            }
        }

        System.out.println(dp[a.length()][b.length()] ? "YES" : "NO");


    }
}
