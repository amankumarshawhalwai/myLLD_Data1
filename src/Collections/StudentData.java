package Collections;

public class StudentData {
    int id;
    String name;
    int age;
    double psp;

    public StudentData(int id, String name, int age, double psp) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                '}';
    }
}
