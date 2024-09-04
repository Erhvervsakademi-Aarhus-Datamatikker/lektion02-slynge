package opgave01;

import java.util.Scanner;

public class CalculateVat {
    public static void main(String[] args) {
        // Step 1: Declarer og assign et user input vha. scanner.
        // Dette input skal være et heltal, der repræsenterer et
        // beløb i hele kroner.
        Scanner input = new Scanner(System.in);
        int beløbIKr = input.nextInt();

        // Step 2: Regn momsbeløbet ud ved at gange user input med 1.25.
        double momsBeløb = beløbIKr * 1.25;

        // Step 3: Print momsbeløbet ud.
        System.out.println("Momsbeløbet er " + momsBeløb + " kr.");
    }
}