package lambdasAndStreams.streams;

import oop3_inheritancePolymorphism.A;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream7 {
    public static void main(String[] args) {
        //Get the maximum number from the stream using reduce()

        //Stream<Integer> s1= Stream.of(1,2,3,4,5);
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);

        System.out.println("Max using reduce function:");
        System.out.println(arr.stream().reduce(Integer.MIN_VALUE,(curr,e)->Math.max(curr,e)));

        System.out.println("Max using reduce function's method:");
        System.out.println(arr.stream().reduce(Math::max));

        // GET THE MINIMUM VALUE IN A STREAM
        System.out.println("Min using reduce function:");
        System.out.println(arr.stream().reduce(Integer.MAX_VALUE,(curr,ele)->Math.min(curr,ele)));

        System.out.println("Min using reduce function's method:");
        System.out.println(arr.stream().reduce(Math::min));
    }
}
