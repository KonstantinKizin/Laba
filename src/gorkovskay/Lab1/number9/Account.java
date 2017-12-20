package gorkovskay.Lab1.number9;

public class Account {

    private String sureName;

    private String accoutNumber;

    private float amount;

    private String valuteName = "rub";



    public Account(String sureName, String accoutNumber, float amount) {
        this.sureName = sureName;
        this.accoutNumber = accoutNumber;
        this.amount = amount;


    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getAccoutNumber() {
        return accoutNumber;
    }

    public void setAccoutNumber(String accoutNumber) {
        this.accoutNumber = accoutNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getValuteName() {
        return valuteName;
    }

    public void setValuteName(String valuteName) {
        this.valuteName = valuteName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "sureName='" + sureName + '\'' +
                ", accoutNumber='" + accoutNumber + '\'' +
                ", amount=" + amount +
                ", valuteName='" + valuteName + '\'' +
                '}';
    }
}
