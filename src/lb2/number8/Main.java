package lb2.number8;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = scanner.nextInt();
        Integer[] arr = new Integer[length];

        for(int i = 0; i < arr.length ;i++){
            arr[i] = scanner.nextInt();
        }

        List<Integer> integerList = new ArrayList<Integer>( Arrays.asList(arr));

        boolean flag = false;

        for(int i = 0; i < integerList.size();i++){

            int tmp = integerList.get(i);
            integerList.remove(i);
            if(integerList.contains(tmp)){
                System.out.println("Есть повторяющиеся элементы!");
                flag = true;
                break;
            }
            integerList.add(tmp);
        }

        if(flag == false){
            System.out.println("Повторяющихся элементов нет!");
        }



    }
}
