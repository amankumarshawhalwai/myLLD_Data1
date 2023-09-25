package Collections;

import java.util.Comparator;

public class Student_ComparatorByPSP implements Comparator<StudentData>{

    /**
     * The below code is for ascending order. Just reverse the signs and it will work for
     * descending as well
     */
    /*@Override                   //PROCESS 1
    public int compare(StudentData o1, StudentData o2) {
        if(o1.psp<o2.psp)
            return -1;
        if(o1.psp>o2.psp)
            return 1;
        return 0;
    }*/

    @Override                     //PROCESS 2
    public int compare(StudentData o1, StudentData o2) {
        return Double.compare(o1.psp,o2.psp);
    }
}
