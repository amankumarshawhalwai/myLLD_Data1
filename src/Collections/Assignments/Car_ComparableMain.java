package Collections.Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Car_ComparableMain {
    public static void main(String[] args) {
        ArrayList<CarDataComparable> arrCar= new ArrayList<>();

        arrCar.add(new CarDataComparable(62,600000));
        arrCar.add(new CarDataComparable(20,890321));

        Collections.sort(arrCar);
        for(CarDataComparable  car:arrCar)
            System.out.println(car);
    }
}
