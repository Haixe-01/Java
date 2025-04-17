import java.util.Scanner;

public class _03_Compund_interest_calculator {
    public static void main(String[] args) {

        // The formula of compound interest is: amount = Principal *
        // Math.pow(1+(Interest/n),n*time)

        Scanner scanner = new Scanner(System.in);

        int Principal;
        double Interest;
        int n;
        int time;
        double amount;

        System.out.println("Enter the Principal amount: ");
        Principal = scanner.nextInt();

        System.out.println("Enter the Interest in %: ");
        Interest = scanner.nextDouble() / 100; // convert to decimal

        System.out.println("Enter the number of times the interest is compounded per year: ");
        n = scanner.nextInt();

        System.out.println("Enter the total time in years: ");
        time = scanner.nextInt();

        amount = Principal * Math.pow(1 + (Interest / n), n * time);

        System.out.printf("The total amount will be: %.2f", amount);

        scanner.close();
    }
}
