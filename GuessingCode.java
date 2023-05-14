import java.util.Random;
import javax.swing.JOptionPane;
public class GuessingCode {
    public static void main(String[] args) {

        int maxNumber = 100; // maximum number to guess
        int numAttempts = 10; // maximum number of attempts

        Random random = new Random();
        int randomNumber = random.nextInt(maxNumber) + 1; // generate random number

        int attempts = 0; // number of attempts
        int guess = 0; // user's guess

        while (attempts < numAttempts) {
            String input = JOptionPane.showInputDialog("Guess a number between 1 and " + maxNumber);
            guess = Integer.parseInt(input);
            attempts++;

            if (guess == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                JOptionPane.showMessageDialog(null, "Your guess is too low. Try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Your guess is too high. Try again.");
            }
        }

        if (attempts == numAttempts) {
            JOptionPane.showMessageDialog(null, "Sorry, you did not guess the number in " + numAttempts + " attempts. The number was " + randomNumber + ".");
        }
    }

}
