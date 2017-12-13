package gorkovskay.laba.secondtask;


public class Runner {

    public static void main(String[] args) {


        //Создаем обьекты студенты
        Student student1 = new Student(180,"Dima");
        Student student2 = new Student(170,"Marina");
        Student student3 = new Student(162,"Dasha");
        Student student4 = new Student(189,"Artem");
        Student student5 = new Student(200,"Nikita");

        //загоняем наши обьекты в массив
        Student[] students = new Student[]{
                student1,
                student2,
                student3,
                student4,
                student5
        };

        float fullGrowth = 0;

        //считаем суммы ростов всех студентов, не забываем что такоц цикл называется for each
        for(Student tmp: students){
            fullGrowth = fullGrowth + tmp.getGrowth();
        }
        //Считаем средний рост
        float averageGrowth = fullGrowth/students.length;


        System.out.println(averageGrowth);

        //опять же используя цикл for each пробегаемся по всем ученикам, и выовдим тех, у кого рост ниже среднего по группе.
        for(Student tmp: students){
            if(tmp.getGrowth() < averageGrowth){
                System.out.println(tmp);
            }
        }


    }
}
