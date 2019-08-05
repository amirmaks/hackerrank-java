package interview_preporation_kit.string_manipulation;

public class alternating_characters {
    public static void main(String[] args) {
        String s = "BBBBB";
        int d = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                d++;
            }
        }

        System.out.println(d);
    }
}
