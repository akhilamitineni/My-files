import java.util.*;

public class Sum_prod_array_37 {
    public static void main(String args[]) {
        int i, n;
        int Arr[] = new int[50];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array");
        n = s.nextInt();
        System.out.println("Enter array elements  ");

        for (i = 0; i < n; i++) {

            Arr[i] = s.nextInt();
        }
        int sum = 0;
        for (int k = 0; k < n; k++) {
            sum = sum + Arr[k];
        }
        System.out.println("sum is  " + sum);

        int product = 1;
        for (int j = 0; j < n; j++) {
            product = product * Arr[j];
            // System.out.println(Arr[j]);
            // 4
            System.out.println(product);
        }
        System.out.println("product is " + product);
    }
}
