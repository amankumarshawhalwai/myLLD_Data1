package lambdasAndStreams.streams;

import java.util.ArrayList;
import java.util.Optional;

public class Stream4 {
    public static void main(String[] args) {
        //Given a list of numbers. mUltiply each number by 3 and return those <20
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(8);

        //Using Map function
        // Map function creates a new stream and does not modify the old Stream of data

        arr.stream().map((ele)->ele*3).filter((ele)->ele<20).forEach((ele)-> System.out.println(ele));

        //It also helps to speed the performance. Sy we want to get the first number after modification
        //then we can use findFirst() function. As soon as it gets the first element, it returns that

        Optional<Integer> k=arr.stream().map((e1)->e1*3).filter((e2)->e2<5).findFirst();
        if(k.isPresent()) System.out.println(k);
        else System.out.println("Nothing found");
    }
}