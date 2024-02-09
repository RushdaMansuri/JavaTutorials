import java.util.Scanner;

public class Main {

    static long factorial(int n){
        if( n == 0 || n ==1 )
            return 1;
        else
            return n * factorial(n-1);
    }

    static long fibonacci(int n){
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Recursion.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's Factorial and Fibonacci: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + ": " + factorial(num));

        //fibonacci
        System.out.println("Fibonacci of " + num + ": ");
        for(int i = 0; i < num; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
