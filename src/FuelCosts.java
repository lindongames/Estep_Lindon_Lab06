import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons = 0.0;
        double mpg = 0.0;
        double pricePerGallon = 0.0;
        boolean done;

        do {
            System.out.print("Gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = gallons > 0;
                if (!done) {
                    System.out.println("Enter a number greater than zero.");
                }
            } else {
                in.nextLine();
                System.out.println("Enter a valid number.");
                done = false;
            }
        } while (!done);

        do {
            System.out.print("Fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = mpg > 0;
                if (!done) {
                    System.out.println("Enter a number greater than zero.");
                }
            } else {
                in.nextLine();
                System.out.println("Enter a valid number.");
                done = false;
            }
        } while (!done);

        do {
            System.out.print("Price of gas per gallon: $");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = pricePerGallon > 0;
                if (!done) {
                    System.out.println("Enter a number greater than zero.");
                }
            } else {
                in.nextLine();
                System.out.println("Enter a valid number.");
                done = false;
            }
        } while (!done);

        double costFor100Miles = (100.0 / mpg) * pricePerGallon;
        double distance = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f%n", costFor100Miles);
        System.out.printf("Distance with a full tank: %.2f miles%n", distance);
    }
}