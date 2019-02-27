package thirty_days_of_code.generics;

import java.util.Scanner;

class Printer<T> {
    public void printArray(T[] array) {
        for (T e: array) {
            System.out.println(e);
        }
    }
}

public class Generics {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        Printer<Integer> integerPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();

        integerPrinter.printArray(intArray);
        stringPrinter.printArray(strings);

        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The printer class should only have 1 method named printArray.");
        }
    }
}
