import java.util.*;
import java.lang.Math;

public class Square_1_10_05{

    public static void main(String[] args) {
        double num;
        int i;
         System.out.println("Square from 1 to 10");
        for (i = 1; i <= 10; i++) {
            num = Math.pow(i, 2);
            System.out.println(num);
        }

    }
}