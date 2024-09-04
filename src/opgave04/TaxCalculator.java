package opgave04;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monthlyIncome = input.nextInt();
        calculateTax(monthlyIncome);
    }

    public static int calculateTax(int monthlyIncome) {
        final int personalAllowance = 48000; // Constant
        final int topTaxLimit = 568900; // Constant

        // Compute yearly income and the tax-required income (yearly income - personal allowance).
        int yearlyIncome = monthlyIncome * 12;
        int taxRequiredIncome = yearlyIncome - personalAllowance;


        // Compute the normal tax (37 %) and top tax (15 % of tax required income - top tax limit)
        int normalTax = (taxRequiredIncome * 37) / 100;
        int topTax = ((taxRequiredIncome - topTaxLimit) * 15) / 100;

        // If the salary is too low to be taxed.
        if(taxRequiredIncome <= 0) {
            return 0;
        }

        // If the salary is high enough to get normal tax, but not high enough for top tax.
        else if (0 < taxRequiredIncome && taxRequiredIncome <= topTaxLimit) {
            return normalTax;
        }

        else {
            // If the salary is high enough for top tax, it will also get normal tax.
            return normalTax + topTax;
        }
    }
}
