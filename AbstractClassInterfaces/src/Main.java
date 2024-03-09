abstract class Base {
    public Base() {
        System.out.println("I am Base class Constructor");
    }

    public void sayHello() {
        System.out.println("Hello from Base.");
    }

    abstract public void greet();
}

class Derived extends Base {
    @Override
    public void greet() {
        System.out.println("Hello from Derived.");
    }

    public void sayHello() {
        System.out.println("Hello from Derived, Derived class.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Class & Interface.");
        Derived d = new Derived();
        d.greet();
    }
}
