package gorkovskay.Lab1.number3;

public class DrobAction {

    public Drob add(Drob a , Drob b){

        Drob res = new Drob();

        if(a.getN() == 0 || b.getM() == 0){
            return null;
        }
        if(a.getM() == b.getM()){
            res.setN(a.getN() + b.getN());
            res.setM(a.getM());
        }else {
            res.setM(a.getM() * b.getM());
            res.setN(a.getN()*b.getM() + b.getN()*a.getM());
        }

        return res;
    }

    public Drob sub(Drob a , Drob b){

        Drob res = new Drob();

        if(a.getN() == 0 || b.getM() == 0){
            return null;
        }
        if(a.getM() == b.getM()){
            res.setN(a.getN() - b.getN());
            res.setM(a.getM());
        }else {
            res.setM(a.getM() * b.getM());
            res.setN(a.getN()*b.getM() - b.getN()*a.getM());
        }
        return res;
    }

    public Drob multiply(Drob a , Drob b){

        Drob res = new Drob();
        res.setN(a.getN() * b.getN());
        res.setM(a.getM() * b.getM());
        return res;
    }


    public Drob div(Drob a , Drob b){

        Drob drob = new Drob();
        drob.setN(a.getN() * b.getM());
        drob.setM(a.getM() * b.getN());
        return drob;
    }



}
