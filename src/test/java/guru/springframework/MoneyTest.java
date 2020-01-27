package guru.springframework;

import org.junit.jupiter.api.AssertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    public void testNameToChange() {
        // Given
        Dollar five = new Dollar(5);
        // When
        five.times(2);
        // Then
        assertEquals(10, five.amount);

    }
}
