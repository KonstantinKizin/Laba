package vytya.var5_task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> lines = new ArrayList<String>();

        System.out.println("Введите число строк : ");

        int linesCount = scanner.nextInt();

        while (linesCount >= 0){
            lines.add(scanner.nextLine());
            linesCount--;
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Collections.sort(lines, comparator);

        for(String line: lines){
            System.out.println(line);
        }



    }
}
