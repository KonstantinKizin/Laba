package gorkovskay.Lab1.number11;

public class Action {

    public Money add(Money a , Money b){

        Money money = new Money();
        Float result = a.generateFloatMoneyValue() + b.generateFloatMoneyValue();
        money.setMoneyValue(result);
        return money;
    }

    public Money substraction(Money a , Money b){

        Money money = new Money();
        Float result = a.generateFloatMoneyValue() - b.generateFloatMoneyValue();
        money.setMoneyValue(result);
        return money;
    }
}
