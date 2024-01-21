import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculate your Percentage");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Subject 1: ");
        int subject1 = sc.nextInt();
        System.out.println("Enter marks of Subject 2: ");
        int subject2 = sc.nextInt();
        System.out.println("Enter marks of Subject 3: ");
        int subject3 = sc.nextInt();
        System.out.println("Enter marks of Subject 4: ");
        int subject4 = sc.nextInt();
        System.out.println("Enter marks of Subject 5: ");
        int subject5 = sc.nextInt();

        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        System.out.println("Total Marks: " + totalMarks + " /500");
        float percentage = ((float)totalMarks / 500) * 100;
        System.out.println("Percentage: " + percentage);
    }
}
