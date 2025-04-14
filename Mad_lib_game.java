import java.util.Scanner;
public class Mad_lib_game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective(description):");
        adjective1 = scanner.nextLine();

        System.out.println("Enter a noun(animal or person):");
        noun1 = scanner.nextLine();

        System.out.println("Enter an adjective(description):");
        adjective2 = scanner.nextLine();

        System.out.println("Enter a verb with an -ing(action):");
        verb1 = scanner.nextLine();

        System.out.println("Enter an adjective(description):");
        adjective3 = scanner.nextLine();

        System.out.println("Today i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit i saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
    }
}
