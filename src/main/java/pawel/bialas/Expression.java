package pawel.bialas;

public interface Expression {

    Money reduce(Bank bank, String to);
}
