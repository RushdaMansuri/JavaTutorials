import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Rushda";
        System.out.println("Hello " + name + "!!");

        int num1 = 10;
        float num2 = 10.890F;
        System.out.printf("Value of num1 is %d and Value of num2 is %f", num1, num2);
        System.out.println();
        System.out.format("Value of num1 is %d and Value of num2 is %8.2f", num1, num2);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string of 20 letters: ");
        String str = sc.nextLine();
        System.out.println("Entered string: " + str);

        System.out.println("Let's play with String Methods:");
        System.out.println("length(): " + str.length());
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("trim(): " + str.trim());
        System.out.println("substring(start): " + str.substring(3));
        System.out.println("substring(start,end): " + str.substring(3, 8));
        System.out.println("replace(oldchar,newchar): " + str.replace('r','s'));
        System.out.println("startsWith(char): " + str.startsWith("da"));
        System.out.println("chatAt(int): " + str.charAt(8));
        System.out.println("indexOf(string): " + str.indexOf("s"));
        System.out.println("lastIndexOf(string): " + str.lastIndexOf("a"));
        System.out.println("equalsIgnoreCase(string): " + str.equalsIgnoreCase("Rushda"));
    }
}
