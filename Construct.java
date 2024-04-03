import java.util.*;

abstract class Base {
    int a;

    Base() {
        System.out.println(" base constructor");
    }

    abstract void run();

    void walk() {
        System.out.println("walking");
    }
}

class Derived extends Base {
    void run() {
        System.out.println(" run method");
    }
}

class Construct {
    public static void main(String[] args) {
        Base b = new Derived();
        b.run();
        b.walk();
    }
}
