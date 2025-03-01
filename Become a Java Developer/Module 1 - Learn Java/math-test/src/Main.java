import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void greetUser(String userName){
        System.out.println("Hello, %s! Welcome to the math quiz.\nYou will be provided with 5 questions, and each carries one mark. Good luck!".formatted(userName));
    }

    public static void printQuestion(int num1, int num2, String op){
        System.out.println("What is %d %s %d?".formatted(num1, op, num2));
    }

    public static void answerFeedback(int userAnswer, int correctAnswer){
        System.out.println("Your answer is: %d\nThe correct answer is: %d".formatted(userAnswer, correctAnswer));
    }

    public static void printResult(String userName){
        System.out.println("Thanks for taking the quiz, %s.\nYou will get your result soon.".formatted(userName));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int num1, num2, userAnswer, correctAnswer;
        String userName, op, question, farewellMessage;

        System.out.print("Please enter your name: ");
        userName = scan.nextLine();

        greetUser(userName);

        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = "-";
        printQuestion(num1, num2, op);
        userAnswer = scan.nextInt();
        correctAnswer = num1 - num2;
        answerFeedback(userAnswer, correctAnswer);

        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = "+";
        printQuestion(num1, num2, op);
        userAnswer = scan.nextInt();
        correctAnswer = num1 + num2;
        answerFeedback(userAnswer, correctAnswer);

        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = "*";
        printQuestion(num1, num2, op);
        userAnswer = scan.nextInt();
        correctAnswer = num1 * num2;
        answerFeedback(userAnswer, correctAnswer);

        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = "/";
        printQuestion(num1, num2, op);
        userAnswer = scan.nextInt();
        correctAnswer = num1 / num2;
        answerFeedback(userAnswer, correctAnswer);

        printResult(userName);

    }
}