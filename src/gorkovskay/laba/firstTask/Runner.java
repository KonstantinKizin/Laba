package gorkovskay.laba.firstTask;


public class Runner {

    static int[] increaseSort(int[] arr){
        int buf;
        for(int i = 0; i < arr.length;i++){
            for(int j = 0 ; j < arr.length;j++ ){
                if(arr[i] < arr[j]){
                    buf = arr[i];
                    arr[i]= arr[j];
                    arr[j] = buf;

                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {


        //создаем массив
        int[] arr = new int[]{0,12,-1,-3,2,4};

        // создаем новый массив, который является отсартированным по возрастанию старым массивом
        int[] newArr = increaseSort(arr);

        //создаем массив без учета большего и меньшего элемента
        int[] arr1 = new int[newArr.length - 2];

        //заполняем новый массив значениями, без учета большего и меньшего элемента
        for(int i = 1; i < newArr.length - 1;i++ ){
            arr1[i-1] = arr[i];
        }

        int count = 0;

        //через цикл for each складываем сумму всех элементов массива.
        for(int tmp:arr1){
            count = count + tmp;
        }
        
        //считаем среднее значение.
        float average = (float)count/arr1.length;

        System.out.println(average);

    }
}
