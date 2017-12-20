package gorkovskay.Lab1.number9;

public class AccountManager {

    private final float DOLLAR_COEFFICIENT = 2.01f;

    private final float EURO_COEFFICIENT = 2.38f;

    private final float DOLLAR_BY_EURO_COEFFICIENT = 8.84f;



    public void convertToDollars(Account account){

        if(account.getValuteName().equalsIgnoreCase("Dollar")){
            return;
        }else if(account.getValuteName().equalsIgnoreCase("Euro")){
            account.setAmount(account.getAmount() / DOLLAR_BY_EURO_COEFFICIENT);
            account.setValuteName("Dollar");
        }else {
            account.setAmount(account.getAmount() / DOLLAR_COEFFICIENT);
            account.setValuteName("Dollar");
        }


    }

    public void convertToEuro(Account account){


        if(account.getValuteName().equalsIgnoreCase("Euro")){
            return;
        }else if(account.getValuteName().equalsIgnoreCase("Dollar")){
            account.setAmount(account.getAmount() / (1 - DOLLAR_BY_EURO_COEFFICIENT) + 1);
            account.setValuteName("Euro");
        }else {
            account.setAmount(account.getAmount() / EURO_COEFFICIENT);
            account.setValuteName("Euro");
        }
    }

    //переводим деньги с acc1 , на acc2 сумму amount
    public boolean transfer(Account acc1 , Account acc2 , float amount){
        if(acc1.getAmount() < amount){
            System.out.println("не достаточно денег на счете "+acc1.getAccoutNumber());
            return false;
        }else if( !acc1.getValuteName().equalsIgnoreCase(acc2.getValuteName())){
            System.out.println("Операция не может быть произведена. На счетах должна быть одна и таже валюта");
            return false;
        }else {
            acc1.setAmount(acc1.getAmount() - amount);
            acc2.setAmount(acc2.getAmount() + amount);
            return true;
        }

    }

    public void addAmount(Account acc , float amount){
        acc.setAmount(acc.getAmount() + amount);
    }

    public void changeOwner(Account acc , String sureName, String accountNumber){
        acc.setSureName(sureName);
        acc.setAccoutNumber(accountNumber);
    }



}
