import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        double result = calculator.add(2.2, 3);
        // Assert
        assertEquals(5.2, result, 0.00001);
    }

    @Test
    public void shouldReturnDifferenceOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        double result = calculator.subtract(5.2, 3.1);
        // Assert
        assertEquals(2.1, result, 0.00001);
    }

    @Test
    public void shouldReturnProductOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        double result = calculator.multiply(4.4, 3);
        // Assert
        assertEquals(13.2, result, 0.00001);
    }

    @Test
    public void shouldReturnQuotientOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        double result = calculator.divide(10, 4);
        // Assert
        assertEquals(2.5, result, 0.00001);
    }
}
