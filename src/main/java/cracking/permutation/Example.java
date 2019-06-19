package cracking.permutation;

public class Example {

    public static void main(String[] args) {
        permutation("abc", "");
    }

    static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String sub1 = str.substring(0, i);
                String sub2 = str.substring(i + 1);
                String rem = sub1 + sub2;
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

}
