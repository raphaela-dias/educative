import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter your name: ");
        String userName = scan.nextLine();

        System.out.println("Welcome to the math test " + userName);

        System.out.println("What is 5 + 3?");
        int question1 = scan.nextInt();

        System.out.println("What is 7 -4?");
        int question2 = scan.nextInt();

        System.out.println("Well done %s! Your score is being processed. Good luck!".formatted(userName));

    }
}