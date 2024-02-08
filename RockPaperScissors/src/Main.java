import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rock, Paper, Scissors Game.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 1, 2, 3:");
        int userInput = sc.nextInt();

        Random rm = new Random();
        int computerInput = 1 + rm.nextInt(3);
        System.out.println("Computer's input: " + computerInput);
        /*
        * 1 = Rock
        * 2 = Paper
        * 3 = Scissors
        * */
        if(userInput == computerInput)
            System.out.println("Match is draw");
        else if(userInput == 1 && computerInput == 3)
            System.out.println("User is winner");
        else if(userInput == 2 && computerInput == 1)
            System.out.println("User is winner");
        else if(userInput == 3 && computerInput == 2)
            System.out.println("User is winner");
        else if(userInput == 3 && computerInput == 1)
            System.out.println("Computer is winner");
        else if(userInput == 1 && computerInput == 2)
            System.out.println("Computer is winner");
        else if(userInput == 2 && computerInput == 3)
            System.out.println("Computer is winner");
    }
}
