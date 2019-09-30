package interview_preporation_kit.string_manipulation;

public class special_palindrome_again {

    public static void main(String[] args) {
        String s = "abaaaa";
        long c = substrCount(s.length(), s);
        System.out.println(c);
    }

    public static long substrCount(int n, String s) {
        int i = 0, j, c=0, ans=0;
        int[] m = new int[n];
        while (i < n) {
            j = i+1;
            c=1;
            while (j<n && s.charAt(i) == s.charAt(j)) {
                ++c;
                ++j;
            }
            ans += c * (c+1)/2;
            m[i] = c;
            i=j;
        }

        for (j = 1; j<n-1;j++) {
            if(s.charAt(j) == s.charAt(j-1)){
                m[j] = m[j-1];
            }

            if(s.charAt(j-1) == s.charAt(j+1) && s.charAt(j) != s.charAt(j-1)){
                ans += Math.min(m[j-1], m[j+1]);
            }
        }

        return ans;
    }
}
