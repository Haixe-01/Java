import java.util.Scanner;

public class _02_Shopping_cart {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        String item;
        Double price;
        int quantity;
        char currency = '$';
        Double total;

        System.out.println("which i tem do u wanna buy?: ");
        item = scanner.nextLine();

        System.out.println("Whats the price of each?: ");
        price = scanner.nextDouble();

        System.out.println("How many do u wanna buy?: ");
        quantity = scanner.nextInt();

        total = price*quantity;

        System.out.println("You have bought " + quantity + " " + item);
        System.out.println("The total will be " + currency + total);
        scanner.close();
    }
}
