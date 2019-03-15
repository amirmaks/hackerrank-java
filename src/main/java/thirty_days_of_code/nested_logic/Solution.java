package thirty_days_of_code.nested_logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String actual = scanner.nextLine();
        String expected = scanner.nextLine();

        int fine = 0;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d M yyyy");
        Date dateActual = simpleDateFormat.parse(actual);
        Date dateExpected = simpleDateFormat.parse(expected);

        if (dateActual.after(dateExpected)) {
            if (
                    dateActual.getMonth() == dateExpected.getMonth() &&
                    dateActual.getYear() == dateExpected.getYear()
            ) {
                fine = 15 * (dateActual.getDate() - dateExpected.getDate());
            } else if(
                    dateActual.getMonth() > dateExpected.getMonth() &&
                    dateActual.getYear() == dateExpected.getYear()
            ) {
                fine = 500 * (dateActual.getMonth() - dateExpected.getMonth());
            } else {
                fine = 10000;
            }
        }

        System.out.println(fine);

    }

}
