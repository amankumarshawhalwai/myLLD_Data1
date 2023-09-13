package oop3_inheritancePolymorphism;

public class Client3Poly {
    public static void main(String[] args) {
        A1Poly a= new B1Poly();
        a.doSomething();
        /**
        * We cannot access the properties of the child class other than the parent class
        **/
        //a.univname="NIT";
        //a.printUniversity();

    }
}
