package gorkovskay.Lab1.number11;

public class Money {

    private int[] fractionArr = new int[10];

    private int value;
    private int realSize;
    private Float moneyValue;

    public Money(){

    }

    public Money(int realSize) {
        this.realSize = realSize;
    }

    public void setMoneyValue(int wholePart,int...fraction){

        this.value = wholePart;
        for(int i = 0; i < realSize;i++){
            fractionArr[i] = fraction[i];
        }
    }



    public int[] getArr() {
        return fractionArr;
    }

    public void setArr(int[] arr) {
        this.fractionArr = arr;
    }

    public int getRealSize() {
        return realSize;
    }

    public void setRealSize(int realSize) {
        this.realSize = realSize;
    }

    public Float getMoneyValue(){
        return this.moneyValue;
    }

    public void setMoneyValue(Float moneyValue){
        this.moneyValue = moneyValue;
    }

    public Float generateFloatMoneyValue(){

       return new Float(this.toString());
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();

        sb.append(value);
        sb.append('.');
        for(Integer buf : fractionArr){
            sb.append(buf);
        }
        return new String(sb);
    }
}
