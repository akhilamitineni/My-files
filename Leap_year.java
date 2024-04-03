import java.util.*;

public class Leap_year {

    public static void main(String[] args) {
        int count = 0, year;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year:   ");
        year = s.nextInt();
        if (year % 4 == 0) {

            if (year % 100 == 0) {
                if (year % 400 == 0)
                    count = 1;
                else
                    count = 0;
            } else
                count = 1;
        } else
            count = 0;

        if (count == 1)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}