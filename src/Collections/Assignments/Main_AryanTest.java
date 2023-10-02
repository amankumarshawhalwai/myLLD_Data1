package Collections.Assignments;

import Collections.Student_AryanTest;

import java.util.ArrayList;
import java.util.List;

public class Main_AryanTest {
    public static void main(String[] args) {
        List<Student_AryanTest> aryan= new ArrayList<>();

        aryan.add(new Student_AryanTest("Aryan",3,"aryanshaw616@gmail.com"));
        for(Student_AryanTest s1:aryan)
            System.out.println(s1);
    }
}
