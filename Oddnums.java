import java.util.*;
import java.lang.*;

public class Oddnums {
    public static void main(String[] args) {
        int arr[] = new int[500];
        int i, n = 0, sum = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (i = 0; i <= n - 1; i++) {
            arr[i] = s.nextInt();
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("sum of odd numbers between 2  num  "+sum);

    }
}