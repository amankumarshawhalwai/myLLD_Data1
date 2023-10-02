package lambdasAndStreams.streams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream6 {
    public static void main(String[] args) {
        //Implementing the Reduce() function of Stream
       // Stream<Integer> s1= Stream.of(1,2,3,4,5);
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);

        //COUNT OF ELEMENTS
        System.out.println(arr.stream().reduce(0,(curr,ele)-> curr+1));

        //SUM OF ELEMENTS
        System.out.println(arr.stream().reduce(0,(curr,ele)->curr+ele));

        //SUBTRACTION RESULT
        System.out.println(arr.stream().reduce(0,(curr,ele)->curr-ele));

        //MULTI RESULT
        System.out.println(arr.stream().reduce(1,(curr,ele)->curr*ele));


    }
}
