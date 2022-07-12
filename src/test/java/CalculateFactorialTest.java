import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateFactorialTest {
    @Test
    void shouldReturnOneIfNumberIsLessThanOrEqualToOne() {
        CalculateFactorial calculateFactorial = new CalculateFactorial(1);
        Integer factorial = calculateFactorial.calculate(1);

        assertEquals(1, factorial);
    }

    @Test
    void ShouldReturnTwoIfNumberIsEqualsTwo() {
        CalculateFactorial calculateFactorial = new CalculateFactorial(1);
        Integer factorial = calculateFactorial.calculate(2);

        assertEquals(2, factorial);
    }

    @Test
    void ShouldReturnSixIfNumberIsEqualsThree() {
        CalculateFactorial calculateFactorial = new CalculateFactorial(1);
        Integer factorial = calculateFactorial.calculate(3);

        assertEquals(6, factorial);
    }
}
