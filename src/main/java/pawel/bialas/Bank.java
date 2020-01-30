package pawel.bialas;

import java.util.HashMap;

public class Bank {

    private HashMap<Pair, Integer> rateMap = new HashMap<>();

    public Money reduce(Expression source, String toCurrency) {

        Money reduce = source.reduce(this, toCurrency);
        System.out.println(reduce);
        return reduce;
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from, to),rate);
    }

    public int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        return rateMap.get(new Pair(from, to));
    }
}
