import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator calc  = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        assertEquals(calc.calculatePolishNotation("3 4 +"), 7);
        assertEquals(calc.calculatePolishNotation("-3 -4 +"), -7);
        assertEquals(calc.calculatePolishNotation("1 2 3 - +"), 0);
        assertEquals(calc.calculatePolishNotation("3 4 *"), 12);
        assertEquals(calc.calculatePolishNotation("1 2 3 * +"), 7);
        assertEquals(calc.calculatePolishNotation("3 -4 +"), -1);
        assertEquals(calc.calculatePolishNotation("-3 -4 *"), 12);
        assertEquals(calc.calculatePolishNotation("6 2  3 -    +"), 5);
    }

}
