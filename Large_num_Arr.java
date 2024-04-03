import java.util.*;

public class Large_num_Arr {
    public static void main(String[] args) {
        int arr[] = new int[50];
        Scanner s = new Scanner(System.in);
        System.out.println("ente the length of array");
        int n = s.nextInt();
        System.out.println("enter array numbers  ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int num = 0;
        for (int k = 0; k < n; k++) {
            if (num < arr[k])
                num = arr[k];
        }
        System.out.println("largest number in array is  " + num);

    }
}