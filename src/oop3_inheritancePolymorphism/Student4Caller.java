package oop3_inheritancePolymorphism;
import java.util.*;
public class Student4Caller {
    /**
     * PASS BY VALUE demo
     * Here, we pass "Aryan" as input to the Student4 class but there the name
     * variable gets replaced with the value that's stored there in the name variable within the dosomething() method
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Entered by the user:"+ name);
        System.out.println("Output by doSomething() method");
        new Student4().doSomething(name);
    }
}
