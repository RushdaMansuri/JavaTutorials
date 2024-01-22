import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Encrypt the entered grade:");
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        System.out.println("Encrypted Grade: " + (char)(grade + 8));
        System.out.println("Decrypted Grade: " + grade);
    }
}
