import java.util.*;

class Prime {
    public static void main(String[] args) {
        int i, num, count = 0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for (i = 2; i <= 10; i++) {
            if (num % i != 0 && num != i) {
                count++;
            }
        }
        if (count > 8) {
            System.out.println(" prime number");
        } else
            System.out.println("not a prime number");

    }

}
