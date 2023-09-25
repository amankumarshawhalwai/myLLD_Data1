package Collections;

import java.util.Comparator;

public class Student_ComparatorById implements Comparator<StudentData> {
    @Override
    public int compare(StudentData o1, StudentData o2) {
        return Integer.compare(o1.id,o2.id);
        /**
         * Just place a (-)[minus] sign before the Integer.compare() to get the result in
         * descending order
         */
    }
}
