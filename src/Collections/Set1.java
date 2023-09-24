package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Hashset does not maintain any insertion order but Linked hashset does.
 * Line 13 shows a normal set but line 14 shows a Linked Hashset implementation
 */
public class Set1 {
    public static void main(String[] args) {
        //Set<Integer> s1= new HashSet<>();
        Set<Integer> s1= new LinkedHashSet<>();
        s1.add(20);
        s1.add(90);
        s1.add(4);

        for(Integer i:s1)
            System.out.println(i);

    }
}
