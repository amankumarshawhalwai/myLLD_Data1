package oop2_accessmodifiers.package1;

public class Client1 {
    public static void main(String[] args) {
        Student st= new Student();
        //st.name="Aman"; (Can't be accessed since name is private)
        // and is accessed from a different class
        st.batchId=5;//different class same package(default)
        st.psp=98.4;
    }
}
