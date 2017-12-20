package gorkovskay.Lab1.number3;

public class Drob {

    private int m;
    private int n;

    public Drob(){

    }


    public Drob(int n, int m) {
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String toString(){
        return this.n+"/"+this.m;
    }

}
