package hackerearth.alghoritms.searching.linear_search;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String[] lengthSubject = firstLine.split(" ");
        String[] elems = secondLine.split(" ");
        ArrayList<Integer> occurrences = new ArrayList<Integer>();

        for (int i = 0; i < elems.length; i++) {
            if (elems[i].equals(lengthSubject[1])) {
                occurrences.add(i);
            }
        }

        System.out.println(occurrences.get(occurrences.size() - 1) + 1);
    }
}
