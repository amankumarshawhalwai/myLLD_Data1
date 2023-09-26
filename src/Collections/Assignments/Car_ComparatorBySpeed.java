package Collections.Assignments;

import java.util.Comparator;

public class Car_ComparatorBySpeed implements Comparator<CarDataForComparator> {
    @Override
    public int compare(CarDataForComparator o1, CarDataForComparator o2) {
        return Integer.compare(o1.speed,o2.speed);
    }
}
