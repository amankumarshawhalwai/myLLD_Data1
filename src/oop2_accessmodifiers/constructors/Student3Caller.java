package oop2_accessmodifiers.constructors;

public class Student3Caller {
    public static void main(String[] args) {

        //Student3 s3= new Student3();// DEFAULT CONSTRUCTOR
       Student3 s4= new Student3("Aman", "NIT");// MANUAL CONSTRUCTOR
        System.out.println("Debugging for default Constructor");
        //Here, the studName and univName are initialized with the values and rest others will be default values
    }
}
