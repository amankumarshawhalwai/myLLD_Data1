package oop3_inheritancePolymorphism;

public class Client2 {
    /**
     * Constructor Chaining using A,B,C,D classes.They are all called by the Client 2 class
     * Use of SUPER keyword to use the parameterized/custom constructor has also been used
     */
    public static void main(String[] args) {
        D d= new D("Hello");
    }
}
