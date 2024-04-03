import java.util.*;
import java.lang.*;

public class Sum_Arr_elements_19 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int sum = 0, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("SUM OF ARRAY ELEMENTS");
        for (i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
            sum = sum + num[i];
        }
        System.out.println("sum is  " + sum);
    }

}
