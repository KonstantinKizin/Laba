package gorkovskay.Lab1.number9;

public class Runner {

    public static void main(String[] args) {


        //обьект, умеющий производить различные денежные операции
        AccountManager accountManager = new AccountManager();

        Account account = new Account("Alexey","1234YD",200);

        System.out.println(account);

        //переводим в доллары счет аккаунта 1
        accountManager.convertToDollars(account);

        System.out.println(account);

        //переводим в евро
        accountManager.convertToEuro(account);

        System.out.println(account);

        Account account1 = new Account("Dima","4321DY",500);

        accountManager.convertToEuro(account1);

        System.out.println(account1);

        boolean f = accountManager.transfer(account,account1,200);








    }
}
