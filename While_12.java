import java.util.*;
import java.io.*;

public class While_12 {

    public static void main(String[] args) {
        int i = 1, num;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        while (i <= 5) {
            num = scan.nextInt();
            sum = sum + num;
            i++;
        }
        System.out.println("sum is " + sum);
    }
}