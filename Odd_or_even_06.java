import java.util.*;
import java.lang.Math;

public class Odd_or_even_06 {

    public static void main(String[] args) {
        int num;
        int i;
        Scanner s = new Scanner(System.in);

        num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " IS EVEN");
        } else
            System.out.println(num + "IS ODD");

    }
}