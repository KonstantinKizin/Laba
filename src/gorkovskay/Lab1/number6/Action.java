package gorkovskay.Lab1.number6;

public class Action {

    public Fraction add(Fraction a , Fraction b){

        Fraction fraction = new Fraction();

        if(a.getN() == 0 || b.getM() == 0){
            throw new UnsupportedOperationException();
        }

        if(a.getM() == b.getM()){
            fraction.setN(a.getN() + b.getN());
            fraction.setM(a.getM());
        }else {
            fraction.setM(a.getM() * b.getM());
            fraction.setN(a.getN()*b.getM() + b.getN()*a.getM());
        }
        return fraction;
    }




}
