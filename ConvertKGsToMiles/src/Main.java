import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Convert Kilograms to Miles in distance.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilograms:");
        float kGs = sc.nextFloat();
        float miles = kGs * 0.62137F;
        System.out.println("Converted Distance: " + miles + " miles.");

    }
}
