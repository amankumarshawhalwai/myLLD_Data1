package oop2_accessmodifiers.package2;

import oop2_accessmodifiers.package1.Student;
//In inheritance the child class gets the properties from the parent as if they were its own
public class Child2 extends Student {
    public static void main(String[] args) {
        Student s3= new Student();
        //s3.batchId=5;//no access because Different package

    }
    public void test()
    {
        //protected variable can be accessed directly without creating an object of it
        psp=45;
    }
}
