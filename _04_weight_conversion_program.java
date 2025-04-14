import java.util.Scanner;

public class _04_weight_conversion_program {
    public static void main(String[] args){
        //WEIGHT CONVERSION PROGRAM
        Scanner scanner = new Scanner(System.in);

        //DECLARE VARIABLES
        double weight;
        double convertedValue;
        int choice;

        //PROMPT FOR USER CHOICE
        System.out.println("WEIGHT CONVERSION PROGRAM");
        System.out.println("1. Kgs to Lbs");
        System.out.println("2. Lbs to Kgs");
        System.out.println("Enter your choice: ");
        choice=scanner.nextInt();

        System.out.println("Enter you current weight:");
        weight=scanner.nextDouble();
        //CHOICE 1 LBS TO KGS
        if(choice==1){
            convertedValue=weight*2.20462;
            System.out.println(convertedValue);
        }
         else if(choice==2){ //CHOICE 2 KGS TO LBS
            convertedValue=weight/2.20462;
            System.out.println(convertedValue);
        } 
        else{ //ELSE PRINT INVALID CHOICE
            System.out.println("Invalid Choice");
        }

        scanner.close();
    }
}
