package gorkovskay.Lab1.number3;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        DrobAction action = new DrobAction();

        Drob drobA = new Drob(3,4);

        Drob drobB = new Drob(4,5);

        System.out.println("DrobA : "+drobA);

        System.out.println("DrobB : "+drobB);

        System.out.println(" DrobA * DrobB = "+action.multiply(drobA,drobB));

        System.out.println("DrobA / DrobB = "+action.div(drobA,drobB));

        System.out.println("DrobA + DrobB = "+action.add(drobA,drobB));

        System.out.println("DrobA - DrobB = "+action.sub(drobA,drobB));

        System.out.println();

        Drob[] drobs = new Drob[3];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < drobs.length;i++){
            Drob drob = new Drob();
            System.out.println("Введите числитель: ");
            drob.setN(scanner.nextInt());
            System.out.println("Введите знаменатель: ");
            drob.setM(scanner.nextInt());
            drobs[i] = drob;
        }

        System.out.println( Arrays.toString(drobs));


    }
}
