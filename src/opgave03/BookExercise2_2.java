package opgave03;

import java.util.Scanner;

public class BookExercise2_2 {
    public static void main(String[] args) {
        // Prompt the user to give the length of the sides of the equilateral triangle.
        System.out.println("Enter length of the sides of the equilateral triangle: ");
        Scanner input = new Scanner(System.in);
        double lengthOfTriangle = input.nextDouble();

        // Then compute height, area and volume of the equilateral triangle.
        double heightOfTriangle = (Math.sqrt(3) / 2) * lengthOfTriangle;
        double areaOfTriangle = (Math.sqrt(3) / 4) * Math.pow(lengthOfTriangle, 2);
        double volumeOfTriangle = areaOfTriangle * heightOfTriangle;

        // Display the area and volume of the triangular prism.
        System.out.println("The area is " + areaOfTriangle);
        System.out.print("The volume of the triangular prism is " + volumeOfTriangle);
    }
}
