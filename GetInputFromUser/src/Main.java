import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Taking inputs from user:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        System.out.println("Let's check how hasNextInt works, enter your input");
        boolean num3 = sc.hasNextInt();
        System.out.println("num3: " + num3);

        /*
        => To run below comment line 13-15

            System.out.println("Let's work with next and nextline. Enter the string: ");
            String usingNext = sc.next();
            System.out.println("Using next: " + usingNext);
            String usingNextLine = sc.nextLine();
            System.out.println("Using nextLine: " + usingNextLine);
        */

    }
}
