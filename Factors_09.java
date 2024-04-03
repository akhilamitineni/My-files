import java.util.*;
import java.lang.Math;

public class Factors_09 {

    public static void main(String[] args) {
        int num;
        int i;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println("factors of   "+num);

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

    }
}