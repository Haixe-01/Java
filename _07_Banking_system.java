import java.util.Scanner;

public class _07_Banking_system {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //DECLARE VARIABLES
        double balance = 0;
        int choice;
        double deposit;
        double withdraw;
        boolean exit = false;

    while (!exit) {
            
        //BANKING SYSTEM PROGRAM
        System.out.println("---------------------");
        System.out.println("KEN BANKING PROGRAM");
        System.out.println("---------------------");

        //DISPLAY MENU
        System.out.println("1. SHOW BALANCE");
        System.out.println("2. DEPOSIT");
        System.out.println("3. WITHDRAW");
        System.out.println("4. EXIT");
        System.out.println("---------------------");

        //TAKE USER IMPUT
        System.out.printf("Enter your choice(1-4): ");
        choice = scanner.nextInt();
        System.out.println("---------------------");
        
        switch(choice){
            case 1 -> {System.out.println("Your balance is:" + balance);
            break;
            }

            case 2 -> {
                System.out.println("Enter the deposit amount: ");
                deposit = scanner.nextDouble();
                balance=Deposit(balance, deposit); 
                System.out.println("Money deposited " + deposit);
                System.out.println("Now your balance is: " + balance);
                break;}

            case 3 -> {
                System.out.println("Enter the withdraw amount: ");
                withdraw = scanner.nextDouble();

                if(withdraw<=balance){
                balance=Withdraw(balance, withdraw);
                System.out.println("Money withdrawn " + withdraw);
                System.out.println("Now your balance is: " + balance);
                break;}
                else if(withdraw>=balance){
                    System.out.println("INSUFFICIENT MONEY!");
                }
            }

            case 4 ->{ exit = true;
            System.out.println("THANK YOU FOR USING KEN BANKING PROGRAM!");
            break;}

            default -> System.out.println("Invalid Input!");

        }
    }
        scanner.close();
}
    static double Deposit(double balance, double deposit){
        balance+=deposit;
        return balance;
    }

    static double Withdraw(double balance, double withdraw){
        balance-=withdraw;
        return balance;
    }
    
}
