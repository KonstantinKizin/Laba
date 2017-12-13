package gorkovskay.Lab1.number6;

public class Fraction {

    private int n;
    private int m;

    public Fraction(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public Fraction(){


    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    @Override
    public String toString(){
        return n+"/"+m;
    }
}
