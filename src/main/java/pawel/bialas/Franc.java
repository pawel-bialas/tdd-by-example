package pawel.bialas;

import java.util.Objects;

public class Franc extends Money {


    public Franc(int amount) {
        this.amount = amount;
    }

    @Override
    public String currency() {
        return "CHF";
    }

    public Money times(int multiplayer) {

        return new Franc(amount * multiplayer);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {

        this.amount = amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
