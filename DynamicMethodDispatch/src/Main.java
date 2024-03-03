class Base{
    public void on(){
        System.out.println("Turning on Base!!!");
    }
    public void off(){
        System.out.println("Turning off Base!!!");
    }
}
class Derived extends Base{
    public void on(){
        System.out.println("Turning on Derived!!!");
    }

    public void music(){
        System.out.println("Music in Derived!!");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Dynamic Method Dispatch.");
        Base b = new Derived();
        b.on();
        b.off();
        // b.music(); => Cant run this method bcoz it's not in base(super) class.
    }
}
