package oop3_inheritancePolymorphism;

public class Client4Overriding {
    public static void main(String[] args) {
        A2Overriding a1= new A2Overriding();
        a1.doSomething();

        A2Overriding a2= new B2Overriding();
        a2.doSomething();
        /**
         * This is method overriding because methods of the parent class get overridden by the child class.
         * Since, same method name, signature and return type also same
         * */

    }
}
