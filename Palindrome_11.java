import java.util.*;
import java.io.*;

public class Palindrome_11 {

    public static void main(String[] args) {
        int num, i;
        String s, str = "";
        char ch = ' ';
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        for (i = s.length() - 1; i >= 0; i--) {
            ch = s.charAt(i);

            str = str + ch;

        }
        for (i = 0; i <= s.length() - 1; i++) {
            System.out.println(s.charAt(i) + " " + str.charAt(i));
        }
        if (s.equals(str)) {
            System.out.println(s + "  is a palindrome");
        } else {
            System.out.println(s + "  is not a palindrome");
        }

    }
}
