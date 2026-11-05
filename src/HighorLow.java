import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;

        do {
            System.out.print("Guess a whole number from 1 to 10: ");

            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();

                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Enter a number from 1 to 10.");
                }
            } else {
                in.nextLine();
                System.out.println("Enter a whole number from 1 to 10.");
            }
        } while (!done);

        System.out.println("The computer's number was " + number + ".");

        if (guess < number) {
            System.out.println("Your guess was low.");
        } else if (guess > number) {
            System.out.println("Your guess was high.");
        } else {
            System.out.println("You guessed correctly!");
        }
    }
}