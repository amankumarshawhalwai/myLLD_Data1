package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main_Comparator {
    public static void main(String[] args) {
        List<StudentData> lc= new ArrayList<>();

        lc.add(new StudentData(2,"Aman",25,92.34));
        lc.add(new StudentData(1,"Aryan",20,98.75));
        lc.add(new StudentData(9,"John", 30,70.56));


        Collections.sort(lc,new Student_ComparatorByPSP());
        for(StudentData s:lc)
            System.out.println(s);
    }
}
