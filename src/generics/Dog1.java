package generics;

import oop4_Interfaces.Animal;

public class Dog1 extends Animal1 {
    int height=20;

    @Override
    public String toString() {
        return "Dog1{" +
                "height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
