import java.util.*;
 class Outerclass{
    public static String msg="message";
           String s="message2";
           public static class Nestedstatic{

            void display1(){
                System.out.println(msg);
            }}
            public class Innerclass{
                void display2(){
                    System.out.println(msg+" "+s);
                }
                }
            }
           
public class GFG{
    public static void main(String args[]){

        Outerclass.Nestedstatic Nested = new Outerclass.Nestedstatic();
        Nested.display1();
        Outerclass outer = new Outerclass();
        Outerclass.Innerclass inner = outer.new Innerclass();
        inner.display2();


    }
}