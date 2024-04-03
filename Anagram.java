import java.util.*;
import java.lang.*;

public class Anagram {
    public static void main(String[] args) {
        String str1, str2;
        char ch = '$';
        int i, j, count = 0;
        Scanner s = new Scanner(System.in);
        str1 = args[0];
        str2 = args[1];
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        StringBuilder stringBuilder1=new StringBuilder(str2);
        if (str1.length() == str2.length()) {
            for (i = 0; i < str1.length(); i++) {
                for (j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == stringBuilder1.charAt(j)) {

                        stringBuilder1.setCharAt(j, ch);

                        System.out.println(stringBuilder1);
                        count++;
                        break;
                    }
                }
            }
        }
        if (count == str1.length()) {
            System.out.println(str1 +" , " +str2+ "  are  anagram");
        } else
            System.out.println(str1 +"  , "+ str2+"  are not an anagram");
    }
}