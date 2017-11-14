package lb1.number12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Train[] trains = createArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пункт назначения: ");

        while (scanner.hasNext()){
            String destination = scanner.next();
            searchTrain(destination,trains);
            System.out.println("Введите пункт назначения: ");

        }




    }


    static void searchTrain(String destination , Train[] trains){

        for(Train train: trains){
            if(train.getDestination().equalsIgnoreCase(destination)){
                System.out.println("Поезд номер: "+train.getTrainNumber()+"\n" +
                        "Пункт назначения: "+train.getDestination()+"\n" +
                        "Время отправления: "+train.getDispatchTime());
            }else {
                System.out.println("Поезда в таком направлении нету.");
            }
        }
    }


    static Train[] createArray(){
        Train[] trains = new Train[2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < trains.length;i++){
            Train train = new Train();
            trains[i] = train;
            System.out.println( "Введите номер для поезда "+(i+1));
            String trainNumber = scanner.next();
            train.setTrainNumber(trainNumber);
            System.out.println( "Введите пункт назначения для поизда "+(i+1));
            train.setDestination(scanner.next());
            System.out.println( "Введите время отправления для поизда "+(i+1));
            train.setDispatchTime(scanner.next());
        }
        return trains;
    }
}
