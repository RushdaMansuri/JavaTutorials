import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Check entered Number is Integer or Not.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        boolean number = sc.hasNextInt();
        if(number)
            System.out.println("Number is Integer.");
        else
            System.out.println("Number is not Integer.");
    }
}
