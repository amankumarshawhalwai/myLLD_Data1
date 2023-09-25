package Collections;

import java.util.ArrayList;
import java.util.List;

public class Main_Comparator {
    public static void main(String[] args) {
        List<StudentData> lc= new ArrayList<>();

        lc.add(new StudentData(2,"Aman",25,92.34));
        lc.add(new StudentData(1,"Aryan",20,98.75));
        lc.add(new StudentData(9,"John", 30,70.56));
        lc.add(new StudentData(5,"Kuanl",28,99.07));


        //Collections.sort(lc,new Student_ComparatorByPSP());
        System.out.println("SORTING BY PSP");
        lc.sort(new Student_ComparatorByPSP()); //This also works fine
        for(StudentData s1:lc)
            System.out.println(s1);
        System.out.println("*****************************************************");
        System.out.println("SORTING BY AGE");
        lc.sort(new Student_CompartorByAge());
        for(StudentData s2:lc)
            System.out.println(s2);
        System.out.println("*****************************************************");
    }
}
