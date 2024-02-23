class Rectangle{
    int length;
    int breadth;

    public Rectangle(){
        length = 4;
        breadth = 5;
    }
    public Rectangle(int len, int bth){
       this.length = len;
       this.breadth = bth;
    }

    public long area(){
        return (long)length * (long)breadth;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Constructor Overloading.");
        Rectangle r1 = new Rectangle();
        System.out.println("Area of r1: " + r1.area());
        Rectangle r2 = new Rectangle(4,5);
        System.out.println("Area of r2: " + r2.area());
    }
}
