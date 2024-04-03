import java.util.*;
import java.lang.*;

public class Calculator {
    public void add(String a, String b) {
        int intVariable1 = Integer.parseInt(a);
        int intVariable2 = Integer.parseInt(b);
        System.out.println(intVariable1 + intVariable2);
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public float division(float a, float b) {
        return a / b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public static void main(String args[]) {
        int subtract;
        float division;
        double multiply;
        String a = "200", b = "300";
        Calculator obj = new Calculator();
        obj.add(a, b);
        subtract = obj.subtract(5, 5);
        division = obj.division(1,0);
        multiply = obj.multiplication(3.2, 6);
        System.out.println("\n" + subtract + "\n" + division + "\n" + multiply);
    }

}
