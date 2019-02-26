package thirty_days_of_code.queues_stacks;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public ArrayList<Character> stack = new ArrayList<Character>();
    public ArrayList<Character> queue = new ArrayList<Character>();

    public void pushCharacter(char c) {
        stack.add(c);
    }

    public void enqueueCharacter(char c) {
        queue.add(c);
    }

    public char popCharacter() {
        return stack.remove(stack.size() - 1);
    }

    public char dequeueCharacter() {
        return queue.remove(0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();

        Solution p = new Solution();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        int l = s.length/2;

        for (int i = 0; i <= l; i++) {
            char a = p.popCharacter();
            char b = p.dequeueCharacter();

            if (a != b) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ));

    }
}
