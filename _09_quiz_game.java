import java.util.Scanner;

public class _09_quiz_game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "What does CPU stand for?",
            "Which data type is used to store text in Java?",
            "What does 'int' stand for?",
            "Which keyword is used to define a class?",
            "What is the default value of a boolean in Java?"
        };

        String[][] options = {
            {"1. Central Process Unit", "2. Central Processing Unit", "3. Computer Personal Unit", "4. Control Process Unit"},
            {"1. myString", "2. string", "3. Txt", "4. String"},
            {"1. integer", "2. interactive", "3. internal", "4. interface"},
            {"1. def", "2. class", "3. struct", "4. define"},
            {"1. true", "2. false", "3. 0", "4. null"}
        };

        int[] answers = {2, 4, 1, 2, 2};
        int guess;
        int total=0;

        System.out.println("-------------------------");
        System.out.println("Good luck for the quiz!");
        System.out.println("-------------------------");

        for(int i= 0; i< questions.length; i++){
            System.out.println(questions[i]);

            for(String option: options[i]){
                System.out.println(option);
            }
            System.out.println();
            System.out.print("Enter your answer: ");
            guess = scanner.nextInt();
           
                if(guess == answers[i]){
                System.out.println("CORRECT!!!");
                total++;
                }
                else{
                    System.out.println("WRONG!!!");
                }
                System.out.println();
            }

        
            System.out.println("Your total is: "+ total);
            
            scanner.close();
        }
    }
