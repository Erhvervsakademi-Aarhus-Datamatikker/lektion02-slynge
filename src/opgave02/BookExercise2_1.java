package opgave02;

import java.util.Scanner;

public class BookExercise2_1 {
    public static void main(String[] args) {
        // Prompt the user to enter number of miles.
        System.out.println("Enter miles:");
        Scanner input = new Scanner(System.in);
        double numberOfMiLES = input.nextDouble();

        // Compute number of kilometers.
        // kilometer = mile * 1.6
        double numberOfKilometers = numberOfMiLES * 1.6;

        // Display the number of kilometers.
        System.out.print(numberOfMiLES + " miles is " + numberOfKilometers + " kilometers");

    }
}
