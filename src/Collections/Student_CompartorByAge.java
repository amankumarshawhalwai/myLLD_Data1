package Collections;

import java.util.Comparator;

public class Student_CompartorByAge implements Comparator<StudentData> {
    @Override
    /*public int compare(StudentData o1, StudentData o2) {
        if(o1.age<o2.age)
            return -1;
        if(o1.age>o2.age)
            return 1;
        return 0;
    }*/
    public int compare(StudentData o1, StudentData o2) {
       return Integer.compare(o1.age,o2.age);
    }
}
