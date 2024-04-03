import java.util.*;

public class Sum_product_array_37 {
    void Summ(int arr[]) {
        int k, sum = 0;
        for (k = 0; k < arr.length; k++) {
            sum = sum + arr[k];
        }
        System.out.println("sum is  " + sum);
    }

    void Productt(int arr[]) {
        int j, product = 0;
        for (j = 0; j < arr.length; j++) {
            product = product * arr[j];
        }
        System.out.println("product is " + product);
    }

    public static void main(String args[]) {
        int i;
        int arr[] = new arr[50];
        Sum_product_array_37 obj = new Sum_product_array_37();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lenght of array");
        n = s.nextInt();
        System.out.println("Enter array elements  ");

        for (i = 0; i < arr.lenght; i++) {
            arr[i] = s.nextInt();
        }
        obj.summ(arr);
        obj.productt(arr);
    }
}
