import java.util.*;
import java.lang.Math;

public class Power_of_n_18 {
    public static void main(String[] args) {
        int i, num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for (i = 0; i <= 10; i++) {
            System.out.println(Math.pow(i, num));
        }
    }

}
