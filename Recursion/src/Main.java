import java.util.Scanner;

public class Main {

    static long factorial(int n){
        if( n == 0 || n ==1 )
            return 1;
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Recursion.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's Factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + ": " + factorial(num));
    }
}
