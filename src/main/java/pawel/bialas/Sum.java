package pawel.bialas;

public class Sum implements Expression{

    Money augment;
    Money addend;


    public Sum(Money augment, Money addend) {
        super();
        this.augment = augment;
        this.addend = addend;
    }

    public Money reduce(String toCurrency) {
        int amount = addend.amount + augment.amount;
        return new Money(amount, toCurrency);
    }
}
