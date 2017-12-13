package gorkovskay.Lab1.number6;


public class Runner {
    
    /*
    создаем массив из обьектов типа дробь. Массив статический т.к. метод main статический
     и в противном случае этот массив не будет видно внутри метода
    * */

    static Fraction[] fractionArray;
    /*
    * создаем обьект экшн , в котором обьявили один мето add(Fraction a, Fraction b)
    * возвращающий третью дробь, являющуюся результатом сложения a и b*/
    static Action action = new Action();




    public static void main(String[] args) {
        //создаем обьекты типа дробь, где первый параметер - числитель, второй - знаминатель.
        Fraction fraction = new Fraction(1,2);
        Fraction fraction1 = new Fraction(3,2);
        Fraction fraction2 = new Fraction(4,2);
        Fraction fraction3 = new Fraction(5,6);
        Fraction fraction4 = new Fraction(1,1);
        Fraction fraction5 = new Fraction(12,4);



        //создаем и инициализируем наш массив, добавляя в него все наши дроби.
        fractionArray = new Fraction[]{fraction, fraction1, fraction2, fraction3,fraction4,fraction5};


        for(int i = 0; i < fractionArray.length;i++){

            //проверяем, не равен ли наш индекс i ,  индексу последнего элемента массива.
            if(i != fractionArray.length-1){

                //смотрим, четный ли индекс дроби и если да, складываем ее со следующей.
                if(i % 2 == 0){
                    System.out.println(action.add(fractionArray[i],fractionArray[i + 1]));
                }
            }
        }
    }
}
