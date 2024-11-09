import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int result = calculator.add(2, 3);
        // Assert
        assertEquals(5, result);
    }

    @Test
    public void shouldReturnDifferenceOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int result = calculator.subtract(5, 3);
        // Assert
        assertEquals(2, result);
    }

    @Test
    public void shouldReturnProductOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int result = calculator.multiply(4, 3);
        // Assert
        assertEquals(12, result);
    }

    @Test
    public void shouldReturnQuotientOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int result = calculator.divide(10, 2);
        // Assert
        assertEquals(5, result);
    }
}
