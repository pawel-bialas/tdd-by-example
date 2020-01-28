package pawel.bialas;

import java.util.Objects;

public class Dollar extends Money {


    public Dollar(int amount) {
        this.amount = amount;

    }

    @Override
    public String currency() {
        return "USD";
    }

    public Money times(int multiplier) {

        return new Dollar(amount * multiplier);
    }


    @Override
    public int hashCode() {

        return Objects.hash(amount);
    }

    public int getAmount() {

        return amount;
    }

    public void setAmount(int amount) {

        this.amount = amount;
    }
}
