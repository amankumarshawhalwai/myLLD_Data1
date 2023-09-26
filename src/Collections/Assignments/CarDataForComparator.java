package Collections.Assignments;

import java.util.Comparator;

public class CarDataForComparator{

    int speed;
    double price;

    public CarDataForComparator(int speed, double price) {
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarData_Comparator{" +
                "speed=" + speed +
                ", price=" + price +
                '}';
    }
}
