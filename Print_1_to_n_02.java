import java.util.*;

public class Print_1_to_n_02 {

    public static void main(String[] args) {
        int num, i;

        Scanner s = new Scanner(System.in);

        num = s.nextInt();
        System.out.println(" print from 1 to  "+num);
        for (i = 1; i <= num; i++) {
            System.out.println(i);
        }

    }
}