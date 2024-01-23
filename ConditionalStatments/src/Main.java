import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conditional Statements: if-else, switch, nested if-else. ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num1 = sc.nextInt();
        int num2 = 200;
        //if-else
        System.out.println("if-else");
        if(num1 > 100)
            System.out.println("Entered number is greater than 100.");
        else
            System.out.println("Entered number is smaller than 100.");

        //nested if-else
        System.out.println("nested if-else");
        if(num1 > 0 && num1 == 100){
            if(num2 == 200){
                System.out.println("Entered number is equal to 100.");
            }
            else{
                System.out.println("Error!!");
            }
        }

        //switch case
        System.out.println("switch case");
        System.out.println("Enter any number from 1 to 7:");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
