package Collections;

import java.util.Comparator;

public class Student_ComparatorByName implements Comparator<StudentData> {
    @Override
    public int compare(StudentData o1, StudentData o2) {
        if(o1.name.compareTo(o2.name)<0)
            return -1;
        if(o1.name.equals(o2.name))
            return 0;
        return 1;
    }
}
