import java.util.*;

public class Print_n_to_1_04 {
    public static void main(String[] args) {
        int num, i;

        Scanner s = new Scanner(System.in);

        num = s.nextInt();
        System.out.println(" print numbers from  "+num+"  to 1");
        for (i = num; i > 0; i--) {
            System.out.println(i);
        }

    }
}