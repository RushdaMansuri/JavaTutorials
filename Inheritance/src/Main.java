class Base{
    public int x;

    public Base(){
        this.x = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printValue(){
        System.out.println("Value of X: " + this.x + " from base.");
    }
}

class Derived extends Base{
    public int y;

    public Derived(){
        this.y = 0;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printValue(){
        System.out.println("Value of X: " + this.x + " from derived.");
        System.out.println("Value of Y: " + this.y + " from derived");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Inheritance.");
        Base b = new Base();
        b.setX(10);
        b.printValue();

        Derived d = new Derived();
        d.setX(100);
        d.setY(20);
        d.printValue();
    }
}
