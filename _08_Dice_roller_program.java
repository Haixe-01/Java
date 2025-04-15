import java.util.Scanner;
import java.util.Random;

public class _08_Dice_roller_program {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number;
        int rolls;
        int i = 0;
        int total = 0;
        System.out.print("Enter the number of times u wanna roll the dice: ");
        number = scanner.nextInt();

        do {
            if (number > 0) {
                rolls = random.nextInt(1, 7);
                System.out.println(diceRolls(rolls));
                System.out.println("You rolled " + rolls);
                i++;
                total += rolls;

            } else {
                System.out.println("#The number should be bigger than zero(o)!");
            }
        } while (number > i);

        System.out.println("----------------------");
        System.out.println("The total is: " + total);
        System.out.println("----------------------");

        scanner.close();
    }

    static String diceRolls(int rolls) {
        String dice1 = """
                 -------
                |       |
                |   *   |
                |       |
                 -------
                """;
        ;
        String dice2 = """
                 -------
                |     * |
                |       |
                | *     |
                 -------
                """;
        ;
        String dice3 = """
                 -------
                |     * |
                |   *   |
                | *     |
                 -------
                """;
        ;
        String dice4 = """
                 -------
                | *   * |
                |       |
                | *   * |
                 -------
                """;
        ;
        String dice5 = """
                 -------
                | *   * |
                |   *   |
                | *   * |
                 -------
                """;
        ;
        String dice6 = """
                 -------
                | *   * |
                | *   * |
                | *   * |
                 -------
                """;
        ;

        return switch (rolls) {
            case 1 -> dice1;
            case 2 -> dice2;
            case 3 -> dice3;
            case 4 -> dice4;
            case 5 -> dice5;
            case 6 -> dice6;
            default -> "Invalid Input";
        };

    }

}
