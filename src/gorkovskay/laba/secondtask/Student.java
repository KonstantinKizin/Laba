package gorkovskay.laba.secondtask;

public class Student {

    private float growth;
    private String name;

    public Student(float growth, String name) {
        this.growth = growth;
        this.name = name;
    }

    public float getGrowth() {
        return growth;
    }

    public void setGrowth(float growth) {
        this.growth = growth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "growth=" + growth +
                ", name='" + name + '\'' +
                '}';
    }
}
