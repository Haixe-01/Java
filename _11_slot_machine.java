import java.util.Scanner;
import java.util.Random;

public class _11_slot_machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        boolean play = true;
        String retry;
        int lossCount = 0;

        do {

            System.out.println("-----------------------------");
            System.out.println("WELCOME TO THE GAME OF SLOTS");
            System.out.println("Symbols: BAN APL BEL STR CSH");
            System.out.println("-----------------------------");

            System.out.println("Your balance: " + balance);

            if (balance == 0) {
                System.out.println("GAME OVER!");
                System.out.println("You are broke now...come back when you got money lmfao");
            }

            System.out.print("How much do you wanna bet?: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (balance < bet) {
                System.out.println("INSUFFICIENT FUNDS!");
            } else if (bet <= 0) {
                System.out.println("INVALID BET!");
            } else if (balance >= bet) {
                balance -= bet;
                System.out.println("SPINNING......");

                System.out.println("-------------");
                String[] spinResult = gamble(lossCount);
                System.out.println("-------------");

                if ((spinResult[0].equals(spinResult[1])) && (spinResult[0].equals(spinResult[2]))) {
                    bet *= 4;
                    balance += bet;

                    System.out.println("You won: " + bet);
                    System.out.println("Your current balance is: " + balance);
                    lossCount = 0;
                } else if ((spinResult[0].equals(spinResult[1])) ||
                        (spinResult[0].equals(spinResult[2])) ||
                        (spinResult[1].equals(spinResult[2]))) {
                    bet *= 2;
                    balance += bet;

                    System.out.println("You won: " + bet);
                    System.out.println("Your current balance is: " + balance);
                } else {
                    System.out.println("No match. Better luck next time!");
                    System.out.println("Your current balance is: " + balance);
                    lossCount++;
                }
            }

            System.out.print("Wanna play again?(yes or no): ");
            retry = scanner.nextLine().toLowerCase();

            if (retry.equals("no")) {
                play = false;
            }

        } while (play);

        System.out.println("Thanks for playing!");

        scanner.close();
    }

    static String[] gamble(int lossCount) {

        Random random = new Random();

        String[] rolls = { "BAN", "APL", "BEL", "STR", "CSH" };
        String[] gmbl = new String[3];

        if (lossCount == 12) {
            String forcedWin = rolls[random.nextInt(rolls.length)];
            gmbl[0] = forcedWin;
            gmbl[1] = forcedWin;
            gmbl[2] = forcedWin;
        } else {
            for (int i = 0; i < 3; i++) {
                gmbl[i] = rolls[random.nextInt(rolls.length)];
            }
        }

        System.out.println("|" + gmbl[0] + "|" + gmbl[1] + "|" + gmbl[2] + "|");

        return gmbl;

    }
}
