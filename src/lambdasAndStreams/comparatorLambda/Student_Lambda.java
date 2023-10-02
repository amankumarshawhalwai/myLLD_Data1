package lambdasAndStreams.comparatorLambda;

public class Student_Lambda {
    public int roll;
    public String name;
    double marks;

    public Student_Lambda(int roll,String name,double marks)
    {
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    @Override
    public String toString() {
        return "Student_Lambda{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
