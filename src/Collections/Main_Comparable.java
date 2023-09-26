package Collections;

import java.util.*;

public class Main_Comparable {

    public static void main(String[] args) {
       List<Student_Comparable> Lc= new ArrayList<>();

       Lc.add(new Student_Comparable("Aman",2,25,95.2));
       Lc.add(new Student_Comparable("Aryan",1,20,98.9));

        //Collections.sort(Student_Comparable);
        /**
         * Since, Java does not get here a natural order for sorting so the error.
         * To fix this:
         *  a) Custom Comparison Function
         *  b) Natural Ordering of Students
         */
        Collections.sort(Lc);
        for(Student_Comparable s:Lc)
            System.out.println(s);
    }
}
