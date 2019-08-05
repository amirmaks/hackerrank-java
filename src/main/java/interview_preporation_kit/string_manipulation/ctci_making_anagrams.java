package interview_preporation_kit.string_manipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ctci_making_anagrams {
    public static void main(String[] args) {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrrhvujlmrpdoqbisbwhmgpmeoke";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if ( !map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if ( !map.containsKey(c)) {
                count++;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()!=0){
                count+=Math.abs(entry.getValue());
            }
        }


        System.out.println(count);

     }


}
