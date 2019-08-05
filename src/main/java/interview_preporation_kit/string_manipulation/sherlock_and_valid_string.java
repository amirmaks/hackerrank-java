package interview_preporation_kit.string_manipulation;

import java.util.HashMap;
import java.util.Map;

public class sherlock_and_valid_string {

    public static void main(String[] args) {
        String s = "aabbcd";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            Integer val = entry.getValue();
            if (freq.containsKey(val)) {
                freq.put(val, freq.get(val) + 1);
            } else {
                freq.put(val, 1);
            }
        }

        if(freq.values().size() == 1) {
            System.out.println("YES");
            return;
        } else if (freq.values().size() == 2) {
            int max = 0;
            int min = 100000;
            for (Map.Entry<Integer, Integer> entry: freq.entrySet()) {
                if (entry.getKey() > max) {
                    max = entry.getKey();
                }

                if (entry.getKey() < min) {
                    min = entry.getKey();
                }
            }

            if (max - min == 1 && freq.get(max) == 1) {
                System.out.println("YES");
                return;
            } else if (min == 1 && freq.get(min) == 1) {
                System.out.println("YES");
                return ;
            }
        }

        System.out.println("NO");
    }
}
