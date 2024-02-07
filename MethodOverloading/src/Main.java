public class Main {

    public static int calculate(int a, int b){
        return a + b;
    }

    public static float calculate(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Method Overloading.");

        System.out.println("Calling int calculate:");
        System.out.println(calculate(10,20));

        System.out.println("Calling float calculate:");
        System.out.println(calculate(10.0f,20.9f));
    }
}
