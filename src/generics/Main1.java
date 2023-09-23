package generics;

import javafx.util.Pair;
import oop4_Interfaces.Animal;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        /**
         * Generic Data types
         */
        Pair1<Integer, String> p1 = new Pair1<>(1, "Hello");
        Pair1<Double, String> p2 = new Pair1<>(2.34, "Hii");

        System.out.println(p2.getFirst());

        /**
         * This is a raw data type. When no parameters are mentioned in a generic type then it is a raw data type
         * The return type is an OBJECT. We need to explicitly typecast into the wanted type
         * There is also a nuance associated with raw data type. If we forcefully typecast a "STRING" type to an
         * "INTEGER" type then there will be no COMPILE TIME ERROR but there will be RUN TIME ERROR.
         * This is due to BACKWARD COMPATIBILITY of Java. See Line 21 for nuance and Line 22 for normal.
         */
        //Pair1 p3= new Pair1("Hello","hi");
        //Integer res= (Integer) p3.getFirst();
        //String res= (String) p3.getFirst();
        //System.out.println(res);

        p1.doSomething("Aman");

        p1.printMoreFirst(new ArrayList<Integer>(){{
            add(3);add(1);add(8);add(9);
        }});

        Pair1<Animal1, Integer> animalCount= new Pair1<>(new Animal1(),4);
        Animal1 a1= new Animal1();
        a1.name="Rich";
        Animal1 a2= new Animal1();
        a2.name="John";
        Animal1 a3= new Animal1();
        a3.name="Michael";
        Animal1 a4= new Dog1();
        a4.name="Doggy1";

       ArrayList<Animal1> animalList= new ArrayList<>();
       animalList.add(a4);

       for(Animal1 ani: animalList){
           System.out.println(ani);
       }
        animalCount.printMoreFirst(new ArrayList<Animal1>(){{add(a1);add(a2);add(a3);add(a4);}});

        /**
         If I can pass a Dog to a variable of data type Animal
         I should be able to pass a List<Dog> to a variable of type List<Animal>
         But this does not happens. This can be seen from line 60

        */

        List<Dog1> dogs = new ArrayList<>();
        List<Dog1> l1=dogs;

        List<? extends Animal1> l2=l1;


    }
}