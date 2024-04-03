import java.util.*;
import java.lang.Math;

public class Even_btw_2num_07 {

    public static void main(String[] args) {
        int num1, num2, i;
        Scanner s = new Scanner(System.in);

        num1 = s.nextInt();
        num2 = s.nextInt();
        System.out.println("Even numbers between   "+num1+"  and  "+num2);
        for (i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}