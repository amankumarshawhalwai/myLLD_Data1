package lambdasAndStreams.streams;

import java.util.ArrayList;

public class Stream3 {
    public static void main(String[] args) {
        //Given a list of elements. Print all the even numbers after multiplying by 2
        //Filter methods helps to filter a value based on our requirements.

        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(8);

        //for printing even numbers
        arr.stream().filter((e)->e%2==0).forEach(System.out::println);
        System.out.println();
        //for printing these numbers after multiplying by 2
        arr.stream().filter((e)->e%2==0).forEach((ele)-> System.out.println(ele*2));

        //Filter works on the same stream
    }
}
