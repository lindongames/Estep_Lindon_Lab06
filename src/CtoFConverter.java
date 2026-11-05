import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double celsius = 0.0;
        boolean done = false;

        do {
            System.out.print("Enter the temperature in Celsius: ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);

        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n",
                celsius, fahrenheit);
    }
}