package lambdasAndStreams.streams;

import java.util.ArrayList;
import java.util.HashSet;

public class Stream2 {
    public static void main(String[] args) {
        //Given a list of elements. Push all these into a set
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(8);

        HashSet<Integer> set= new HashSet<>();
        arr.stream().forEach((e)->set.add(e));
        System.out.println(set);
    }
}
