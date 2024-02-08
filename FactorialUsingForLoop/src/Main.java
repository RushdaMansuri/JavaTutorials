public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial using For Loop.");
        int number = 0;

        if (number == 0) {
            System.out.println("Factorial of " + number + ": 1");
        }
        else {
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println("Factorial of " + number + ": " + result);
        }
    }
}
