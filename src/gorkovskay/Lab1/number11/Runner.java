package gorkovskay.Lab1.number11;

public class Runner {

    public static void main(String[] args) {

        Money money = new Money(3);
        money.setMoneyValue(10,1,3,5);
        Money money1 = new Money(3);
        money1.setMoneyValue(10,2,3,7);
        Money exp = new Action().add(money,money1);
        System.out.println(exp.getMoneyValue());

    }
}
