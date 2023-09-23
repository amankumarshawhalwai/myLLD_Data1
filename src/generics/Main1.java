package generics;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        /**
         * Generic Data types
         */
        Pair1<Integer, String> p1 = new Pair1<>(1, "Hello");
        Pair1<Double, String> p2 = new Pair1<>(2.34, "Hii");

        System.out.println(p2.getFirst());

        /**
         * This is a raw data type. When no parameters are mentioned in a generic type then it is a raw data type
         * The return type is an OBJECT. We need to explicitly typecast into the wanted type
         * There is also a nuance associated with raw data type. If we forcefully typecast a "STRING" type to an
         * "INTEGER" type then there will be no COMPILE TIME ERROR but there will be RUN TIME ERROR.
         * This is due to BACKWARD COMPATIBILITY of Java. See Line 21 for nuance and Line 22 for normal.
         */
        //Pair1 p3= new Pair1("Hello","hi");
        //Integer res= (Integer) p3.getFirst();
        //String res= (String) p3.getFirst();
        //System.out.println(res);

        p1.doSomething("Aman");

        p1.printMoreFirst(new ArrayList<Integer>(){{
            add(3);add(1);add(8);add(9);
        }});
    }
}