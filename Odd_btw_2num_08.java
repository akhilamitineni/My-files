import java.util.*;
import java.lang.Math;

public class Odd_btw_2num_08 {

    public static void main(String[] args) {
        int num1, num2, i;
        Scanner s = new Scanner(System.in);

        num1 = s.nextInt();
        num2 = s.nextInt();
        System.out.println(" Odd numbers between  "+num1+"  and  "+num2);
        for (i = num1; i <= num2; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }
}