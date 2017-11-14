package lb2.number5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for(int i = 0; i < arr.length ;i++){
            arr[i] = scanner.nextInt();
        }


        while (true){

            boolean flag = false;
            System.out.println("Введите число для проверки: ");

            int number = scanner.nextInt();
            for(int tmp: arr){
                if(tmp == number){
                    flag = true;
                    break;
                }
            }

            if(flag == false){
                System.out.println("Такого числа нет.");
            }else {
                System.out.println("Такое число есть.");
            }

        }
    }

}
