package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMultiplierMethod() {
        // Given
        Dollar five = new Dollar(5);

        // When
        Dollar product = five.times(2);
        Dollar product2 = five.times(3);
        // Then
        assertEquals(10, product.amount);
        assertEquals(15, product2.amount);

    }

    @Test
    public void testEquality() {
        // Given

        // When

        // Then
        assertEquals(new Dollar(5),new Dollar(5));
        assertNotEquals(new Dollar(5),new Dollar(6));
    }
}
