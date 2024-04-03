import java.util.*;
import java.io.*;

public class Multiplicate_nrows_14 {

    public static void main(String[] args) {
        int i, num, rows;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for the multiplication ");
        num = scan.nextInt();
        System.out.println("Enter the no of rows");
        rows = scan.nextInt();
        for (i = 1; i <= rows; i++) {
            System.out.println(num + " * " + i + "= " + i * num);

        }

    }
}