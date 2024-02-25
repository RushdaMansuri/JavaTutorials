class Base{
    public Base(){
        System.out.println("I am constructor of BASE class..");
    }

    public Base(int a){
        System.out.println("I am constructor of BASE class with a parameter. The value of a: " + a);
    }
}

class Derived extends Base{
    public Derived(){
        super(10); //super keyword to execute the parameter constructor
        System.out.println("I am constructor of DERIVED class..");
    }

    public Derived(int a, int b){ //constructor overloading
        super(a);
        System.out.println("I am constructor of Derived class with a parameter. The value of a: " + a + ". The value of b: " + b);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Constructors in Inheritance.");
        Derived d = new Derived();
        Derived d1 = new Derived(10,20);

    }
}
