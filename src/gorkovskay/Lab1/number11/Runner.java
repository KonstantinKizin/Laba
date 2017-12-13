package gorkovskay.Lab1.number11;

public class Runner {

    public static void main(String[] args) {

        Money money = new Money(3);
        money.setMoneyValue(10,1,3,5);
        Money money1 = new Money(3);
        money.setMoneyValue(10,1,3,5);
        System.out.println(new Action().add(money,money1));

    }
}
