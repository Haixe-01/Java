import java.util.Scanner;

public class _05_Calculator_program{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double firstNum;
        double secNum;
        char operator;
        double result=0;
        boolean validOp = true;

        System.out.println("Enter the first number:");
        firstNum = scanner.nextDouble();

        System.out.println("Enter the second number:");
        secNum = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, /, *, ^): ");
        operator = scanner.next().charAt(0);

        switch(operator){
            case '+' -> result = firstNum + secNum;

            case '-' -> result = firstNum - secNum;

            case '*' -> result = firstNum * secNum;

            case '/' -> {
                 if(secNum == 0){
                    System.out.print("Cannot be divided by zero!");
                    validOp = false;
                } else{
                 result = firstNum / secNum;
                }

            }

            case '^' -> result = Math.pow(firstNum, secNum);

            default -> {System.out.println("Invalid Operator!");
            validOp = false;
        }
        }

        if(validOp){
            System.out.println(result);
        }

        scanner.close();
    }
}



