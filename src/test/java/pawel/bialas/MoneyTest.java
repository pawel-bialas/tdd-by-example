package pawel.bialas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMultiplierMethodForDollar() {
        // Given
        Money five = Money.dollar(5);

        // Then
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));

    }

    @Test
    public void testEqualityForDollar() {
        // Given

        // When

        // Then
        assertEquals(Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.dollar(5),Money.dollar(6));
    }

    @Test
    public void testMultiplierMethodForFranc() {
        // Given
        Money five = Money.franc(5);

        // Then
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));

    }

    @Test
    public void testEqualityForFranc() {
        // Given

        // When

        // Then
        assertEquals(Money.franc(5),Money.franc(5));
        assertNotEquals(Money.franc(5),Money.franc(6));
    }

    @Test
    public void compareDollarToFranc() {
        // Given

        // When

        // Then
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }


    @Test
    public void testCurrency() {
        // Given

        // When

        // Then
        assertEquals("USD",Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testSimpleAddition() {
        // Given
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        // When
        Money result = bank.reduce(sum, five.getCurrency());
        // Then
        assertEquals(Money.dollar(10), result);
    }

    @Test
    public void testPlusReturnSum() {
        // Given
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        // When

        // Then
        assertEquals(five, sum.augment);
        assertEquals(five, sum.addend);
    }

    @Test
    public void testReduceSum() {
        // Given
        Expression sum = new Sum(Money.dollar(4), Money.dollar(3));
        Bank bank = new Bank();
        // When
        Money result = bank.reduce(sum, "USD");
        // Then
        assertEquals(Money.dollar(7),result);
    }

    @Test
    public void testReduceMoney() {
        // Given
        Bank bank = new Bank();
        // When
        Money result = bank.reduce(Money.dollar(1), "USD");
        // Then
        assertEquals(Money.dollar(1), result);
    }
}
