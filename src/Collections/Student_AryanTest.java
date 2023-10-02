package Collections;

public class Student_AryanTest {
    String name;
    int roll;
    String email;

    public Student_AryanTest(String name, int roll, String email) {
        this.name = name;
        this.roll = roll;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student_AryanTest{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", email='" + email + '\'' +
                '}';
    }
}
