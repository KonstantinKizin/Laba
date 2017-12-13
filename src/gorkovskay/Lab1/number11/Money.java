package gorkovskay.Lab1.number11;

public class Money {

    private int[] fractionArr = new int[10];

    private int value;
    private int realSize;

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
