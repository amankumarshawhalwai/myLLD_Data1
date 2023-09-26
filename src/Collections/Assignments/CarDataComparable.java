package Collections.Assignments;

import org.jetbrains.annotations.NotNull;

public class CarDataComparable implements Comparable<CarDataComparable>{
    int speed;
    double price;

    public CarDataComparable(int speed,double price){
        this.speed=speed;
        this.price=price;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "speed=" + speed +
                ", price=" + price +
                '}';
    }
    public int compareTo(@NotNull CarDataComparable other) {
        if(this.speed<other.speed) return -1;
        if(this.speed>other.speed) return 1;
        return 0;
    }
}
