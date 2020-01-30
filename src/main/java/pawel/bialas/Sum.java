package pawel.bialas;

public class Sum implements Expression{

    Money augment;
    Money addend;


    public Sum(Money augment, Money addend) {
        super();
        this.augment = augment;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        int amount = addend.amount + augment.amount;
        return new Money(amount, toCurrency);
    }
}
