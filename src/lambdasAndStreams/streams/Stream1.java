package lambdasAndStreams.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(5);
        arr.add(2);arr.add(6);arr.add(2);

        Stream<Integer> s1= arr.stream();
        System.out.println("List multiplied by 2 operation");
        s1.forEach((e)-> System.out.println(e*2));

    }
}
