package main.java.com.igbokedaniel.guessGame;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int attempts = 0;
        boolean endProgram = false;
        String attemptWord;

        while (!endProgram) {
            attempts=0;
            int randomNumber = random.nextInt(0,101);
            boolean continueGuess = true;

            while (continueGuess) {
                System.out.print("Enter your guess: ");

                while (true) {
                    try {
                        guess = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Enter a valid digit: ");
                        scanner.next(); //consume the invalid digit
                        System.out.print("Enter your guess: "); //re prompt
                    }
                    
                }
                
                attempts++;
                if (guess == randomNumber) {
                    attemptWord = (attempts == 1) ? "attempt" : "attempts";
                    System.out.printf("Congratulations the correct Guess is %d.\nYou reached that in %d %s\n",randomNumber,attempts,attemptWord);
                    System.out.print("Do you want to Quit (y/n)?: ");
                    String answer = scanner.next();
                    if (answer.equals("y")) {
                        endProgram = true;
                        break; 
                    }
                    else if (answer.equals("n")) {
                        continueGuess = false;
                        continue;  
                    }
                    
                    
                }
                else{
                    System.out.println("Incorrect guess");
                    String help = (guess > randomNumber) ? "Too High" : "Too Low";
                    System.out.printf("Guess %s\n",help);
                    System.out.print("Quit (y/n): ");
                    String answer1 = scanner.next();
                    if (answer1.equals("n")){
                        continue;
                    }
                    else if(answer1.equals("y")){
                        endProgram = true;
                        break;
                    }
    
                }
                
            }

            
            
        }
        scanner.close();    
    }
    
}
