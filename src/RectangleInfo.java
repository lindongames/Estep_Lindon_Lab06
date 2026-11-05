import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width = 0.0;
        double height = 0.0;
        boolean done;

        do {
            System.out.print("Enter the rectangle width: ");

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = width > 0;

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
            System.out.print("Enter the rectangle height: ");

            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = height > 0;

                if (!done) {
                    System.out.println("Enter a number greater than zero.");
                }
            } else {
                in.nextLine();
                System.out.println("Enter a valid number.");
                done = false;
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}