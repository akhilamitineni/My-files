import java.util.*;

class PrimeNumbers {
    public static void main(String[] args) {
        int i, num1, num2, count = 0;
        Scanner s = new Scanner(System.in);
        num1 = s.nextInt();
        num2 = s.nextInt();
        while (num1 <= num2) {
            count = 0;

            for (i = 2; i <= num1 / 2; ++i) {
                if (num1 % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0 && num1 != 0 && num1 != 1) {
                System.out.println(num1);
            }
            ++num1;
        }

    }

}
