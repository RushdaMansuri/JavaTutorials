class Base{
    public void  method1(){
        System.out.println("Method1 of Class A!!");
    }

    public void  method2(){
        System.out.println("Method2 of Class A!!");
    }
}

class Derived extends Base{
    @Override
    public void  method2(){
        System.out.println("Method2 of Class B!!");
    }

}
public class Main {
    public static void main(String[] args) {
        System.out.println("Method Overriding.");
        Base b = new Base();
        Derived d= new Derived();
        b.method2();
        d.method2();
    }
}
