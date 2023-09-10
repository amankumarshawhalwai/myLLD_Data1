package oop2_accessmodifiers.package1;

public class Child1 extends Student{
    public static void main(String[] args) {
        Student s2= new Student();
        s2.batchId=5;// same package different package
        s2.psp=98;// Child class same package can access
    }
}
