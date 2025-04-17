import java.util.Scanner;
import java.util.Random;

public class _10_rock_paper_scissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] gamble = { "rock", "paper", "scissor" };
        String userChoice;
        String computerChoice;
        boolean retry = true;
        String input;

        do {
            System.out.print("Enter you choice(Rock, Paper, Scissor): ");
            userChoice = scanner.nextLine().toLowerCase();
            System.out.println();

            computerChoice = gamble[random.nextInt(3)];
            System.out.println("Your choice is: " + userChoice);
            System.out.println("Computer's coice is: " + computerChoice);

            if ((!userChoice.equals("rock")) &&
                    (!userChoice.equals("paper")) &&
                    (!userChoice.equals("scissor"))) {
                        System.out.println();
                        System.out.println("-----------------");
                System.out.println("INVALID INPUT!");
                System.out.println("-----------------");
                continue;
            } else if (userChoice.equals(computerChoice)) {
                System.out.println();
                System.out.println("-----------------");
                System.out.println("IT'S A TIE!");
                System.out.println("-----------------");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissor")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissor") && computerChoice.equals("paper"))) {
                System.out.println();
                System.out.println("-----------------");
                System.out.println("YOU WIN!!!");
                System.out.println("-----------------");
            } else {
                System.out.println();
                System.out.println("-----------------");
                System.out.println("YOU LOSE!!!");
                System.out.println("-----------------");
            }

            System.out.print("Do you wanna play again? (yes or no): ");
            input = scanner.nextLine();

            if (input.equals("no")) {
                System.out.println("Thank you for playing");
                retry = false;
                break;
            }

        } while (retry = true);

        scanner.close();
    }
}
