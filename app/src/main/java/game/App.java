/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package game;

import java.util.Scanner;

public class App {
    static WordChooser chooser = new WordChooser();
    static Game game = new Game(chooser);


    public String getGreeting() {
        return "Welcome! Today the word to guess is:";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Scanner scanner = new Scanner(System.in);
    do {
        System.out.println(game.getWordToGuess());
        System.out.println("Enter your guess:");

        
        Character guess = scanner.nextLine().charAt(0);
        


        if (game.guessletter(guess))
            {System.out.println("Correct!!");}
        else
            {System.out.println("Incorrect!!");}
            

    } while (game.remainingAttempts() > 0);
      scanner.close();
}
}
