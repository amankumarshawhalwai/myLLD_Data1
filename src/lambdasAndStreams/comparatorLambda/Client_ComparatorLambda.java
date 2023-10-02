package lambdasAndStreams.comparatorLambda;

import java.util.ArrayList;
import java.util.Collections;


public class Client_ComparatorLambda {
    public static void main(String[] args) {
        ArrayList<Student_Lambda> arr= new ArrayList<>();

        arr.add(new Student_Lambda(12,"Aryan",98.5));
        arr.add(new Student_Lambda(13,"Aman",98.6));

        //VERSION 1
        /*Comparator<Student_Lambda> studentComparatorByMarks= (o1,o2)->{
            if(o1.name.compareTo(o2.name)<0)
                return -1;
            if(o1.name.equals(o2.name))
                return 1;
            return 0;
        };*/
        //VERSION 2
        Collections.sort(arr,(o1,o2)->{
            if(o1.marks<o2.marks) return -1;
            if(o1.marks>o2.marks) return 1;
            return 0;
        });
        for(Student_Lambda s1:arr)
            System.out.println(s1);
    }
}
