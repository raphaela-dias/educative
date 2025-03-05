import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void greetUser(String userName){
        System.out.println("Hello, %s! Welcome to the math quiz.\nYou will be provided with 5 questions, and each carries one mark. Good luck!".formatted(userName));
    }

    public static String chooseOperator(int opNum){
        if (opNum == 1) {
            return "-";
        }
        else if (opNum == 2){
            return "+";
        }
        else if (opNum == 3){
            return "*";
        }
        else{
            return "/";
        }
    }

    public static int calculateAnswer(int n1, int n2, String op){
        return switch (op) {
            case "-" -> n1 - n2;
            case "+" -> n1 + n2;
            case "*" -> n1 * n2;
            default -> (int) (n1 / n2);
        };
    }

    public static void printQuestion(int num1, int num2, String op){
        System.out.println("What is %d %s %d?".formatted(num1, op, num2));
    }

    public static int answerFeedback(int userAnswer, int correctAnswer, int score){
        if (userAnswer == correctAnswer){
            score += 1;
            System.out.println("Your answer was correct.\nYour score now is %d".formatted(score));
        }else{
            System.out.println("Your answer was incorrect.\nYour score now is %d".formatted(score));
        }
        return score;
    }

    public static void printResult(String userName, int score){
        System.out.println("Thanks for taking the quiz, %s.\nYour final score is %d.".formatted(userName, score));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int num1 = 0, num2 = 0, userAnswer = 0, correctAnswer = 0, opNum = 0, score = 0;
        String userName, op = "";

        System.out.print("Please enter your name: ");
        userName = scan.nextLine();

        greetUser(userName);

        for (int i = 0; i < 5; i++) {

            num1 = random.nextInt(10) + 1;
            num2 = random.nextInt(10) + 1;
            opNum = random.nextInt(4) + 1;
            op = chooseOperator(opNum);
            printQuestion(num1, num2, op);
            userAnswer = scan.nextInt();
            correctAnswer = calculateAnswer(num1, num2, op);
            System.out.println("Your answer is: " + userAnswer);
            System.out.println("The correct answer is: " + correctAnswer);
            score = answerFeedback(userAnswer, correctAnswer, score);

        }

        printResult(userName, score);

    }
}