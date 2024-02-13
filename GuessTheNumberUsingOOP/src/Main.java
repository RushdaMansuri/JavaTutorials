import java.util.Random;
import java.util.Scanner;

class Game{
    int computerGuess;
    int userGuess;
    int noOfGuess = 0;
    boolean callIsCorrect = false;
    public Game(){
       Random rand = new Random();
       computerGuess = rand.nextInt(100);
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println(computerGuess);
        System.out.print("Enter your guess: ");
        userGuess = sc.nextInt();
        if(callIsCorrect){
            callIsCorrect = false;
            isCorrectAnswer();
        }
    }

    public boolean isCorrectAnswer(){
        if(computerGuess == userGuess){
            noOfGuess +=1;
            System.out.println("You won the game in " + noOfGuess + " guesses!!");
            return true;
        }
        else if(computerGuess < userGuess) {
            callIsCorrect = true;
            noOfGuess +=1;
            System.out.println("Oops, sorry your guess is smaller than computer!!");
            takeUserInput();
            return false;
        }
         else if(computerGuess > userGuess){
            callIsCorrect = true;
            noOfGuess +=1;
            System.out.println("Oops, sorry your guess is greater than computer!!");
            takeUserInput();
            return false;
        }
        else
            return false;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Guess the Number");
        Game player1 = new Game();
        player1.takeUserInput();
        player1.isCorrectAnswer();
    }
}
