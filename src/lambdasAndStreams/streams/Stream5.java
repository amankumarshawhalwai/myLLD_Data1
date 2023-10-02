package lambdasAndStreams.streams;

import java.util.stream.Stream;

public class Stream5 {
    public static void main(String[] args) {
        Stream<Integer> st1= Stream.of(1,2,3,5,6,7);

        System.out.println("*****************************");
        st1.map((e1)->e1*2).forEach(System.out::println);
    }
}
