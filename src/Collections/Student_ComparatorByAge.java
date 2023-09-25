package Collections;

import java.util.Comparator;

public class Student_ComparatorByAge implements Comparator<StudentData> {
    @Override
    /*public int compare(StudentData o1, StudentData o2) { //PROCESS 1
        if(o1.age<o2.age)
            return -1;
        if(o1.age>o2.age)
            return 1;
        return 0;
    }*/
    public int compare(StudentData o1, StudentData o2) { //PROCESS 2
       return Integer.compare(o1.age,o2.age);
    }
}
