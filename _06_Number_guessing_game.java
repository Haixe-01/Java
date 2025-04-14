import java.util.Scanner;
import java.util.Random;

public class _06_Number_guessing_game {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNum = random.nextInt(0, 11);

        System.out.println("NUMBER GUESSING GAME!");
        System.out.println("Enter a number between 0 and 11");
        do {
            System.out.println("Enter you guess: ");
            guess = scanner.nextInt();

            if (guess > randomNum) {
                System.out.println("Try a lower number");
            } else if (guess < randomNum) {
                System.out.println("Enter a higher number");
            }
            attempts++;

        } while (guess != randomNum);

        System.out.println("You won!!!!");
        System.out.println("You took " + attempts + " attempts");

        scanner.close();
    }
}
