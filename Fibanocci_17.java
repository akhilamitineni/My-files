import java.util.*;
import java.lang.*;

public class Fibanocci_17 {
    public static void main(String[] args) {
        int[] num = new int[50];
        int i = 0;
        for (i = 0; i <= 50; i++) {
            if (i == 0 || i == 1) {
                num[i] = i;
            } else {
                num[i] = num[i - 1] + num[i - 2];
            }
            if (num[i] > 50) {
                break;
            }

        }
        for (i = 0; i <= num.length; ++i) {
            // System.out.println(num[i]);//
            if (num[i] >= 50) {
                break;
            } else
                System.out.println(num[i]);
        }

    }
}
