import java.util.*;
import java.lang.Math;

public class Amstrong_36 {
    public static void main(String[] args) {
        int i, n;
        int arr[] = new int[500];
        double sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(" ENTER ARRAY LENGTH  ");
        n = scan.nextInt();
        System.out.println("Enter the number in array");

        for (i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (i = 0; i < arr.length; i++) {
            sum = sum + Math.pow(arr[i], n);
        }
        int num = 0;
        for (i = 0; i < n; i++) {
            num = 10 * num + arr[i];

        }
        if (num == sum) {
            System.out.println(num + "  is an AMSTRONG number");
        } else
            System.out.println(num + "  is not an AMSTRONG number");

    }

}
