
import opgave04.TaxCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TaxCalculatorTest {
    @Test
    public void NoTax() {
        int actual = TaxCalculator.calculateTax(4000);
        assertEquals("Hvis man ikke tjener mere end personfradraget skal man ikke betale noget i skat", 0, actual);
    }

    @Test
    public void SmallSalary() {
        int actual = TaxCalculator.calculateTax(1000);
        assertEquals("Hvis man ikke bruger hele personfradraget får man ikke skat tilbage", 0, actual);
    }

    @Test
    public void SomeTax() {
        int actual = TaxCalculator.calculateTax(10000);
        assertEquals("Du skal betale 37% af det du tjener over 4000 kr. om måneden.", 26640, actual);
    }

    @Test
    public void HighTax() {
        int actual = TaxCalculator.calculateTax(60000);
        assertEquals("Du skal betale 15% skal af det beløb du tjener over 568.900 kr.", 264105, actual);
    }
}
