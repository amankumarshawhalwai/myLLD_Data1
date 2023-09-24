package Collections;

import java.util.Comparator;

public class Student_ComparatorByPSP implements Comparator<StudentData>{


    @Override
    public int compare(StudentData o1, StudentData o2) {
        if(o1.psp< o2.psp)
            return -1;
        if(o1.psp>o2.psp)
            return 1;
        return 0;
    }
}
