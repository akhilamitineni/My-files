import java.util.*;
import java.lang.*;

public class Vowels_30 {
    public static void main(String[] args){
    String str=""; int count=0;
    Scanner s =new Scanner(System.in);
    str=s.nextLine();
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
            count++;
        }
    }System.out.println("vowels in the given string are   "+ count);


}
}