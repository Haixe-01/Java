import java.util.Scanner;

public class _05_Calculator_program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        char operator;
        double output = 0 ;

        System.out.println("Enter the first number: ");
        firstNumber=scanner.nextDouble();

        System.out.println("Enter the operator(+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextDouble();

        switch(operator){
            case '+'-> output= firstNumber+secondNumber;
            case '-'-> output= firstNumber-secondNumber;
            case '*'-> output= firstNumber*secondNumber;
            case '/'-> output= firstNumber/secondNumber;
            case '^'-> output= Math.pow(firstNumber,secondNumber);

            default -> System.out.println("Invalid Operator!");
        }

        System.out.println("The result is:" + output);

        scanner.close();
        }
    }

