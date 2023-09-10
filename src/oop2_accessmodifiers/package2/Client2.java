package oop2_accessmodifiers.package2;

import oop2_accessmodifiers.package1.Student;

public class Client2 {
    public static void main(String[] args) {
        Student st1= new Student();
        //st1.name="Aman";(Can't be accessed since is is private and also
        // different class from a different package)
        //st1.batchId=5;(Can't be accessed because different package)
        //st1.psp=33; (can't be accessed since different package)

    }
}
