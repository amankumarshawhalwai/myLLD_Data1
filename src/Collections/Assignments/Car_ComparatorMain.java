package Collections.Assignments;

import java.util.ArrayList;

public class Car_ComparatorMain {
    public static void main(String[] args) {
        ArrayList<CarDataForComparator> car= new ArrayList<>();

        car.add(new CarDataForComparator(50,600000));
        car.add(new CarDataForComparator(32,978125));

        car.sort(new Car_ComparatorBySpeed());
        for(CarDataForComparator car1:car)
            System.out.println(car1);
    }
}
