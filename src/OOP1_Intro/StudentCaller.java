package OOP1_Intro;

public class StudentCaller {
    //Main method for calling the Student class and its methods here
    public static void main(String[] args) {
        Student st1= new Student();
        st1.name="Aman";
        st1.age=25;
        st1.psp=90.26;
        st1.batchName="Beta Batch";

        st1.printStudentData();
        st1.changeBatch("Alpha Batch");
        st1.newBatch();
        System.out.println("*******************************************");

        Student st2= new Student();
        st2.name="Aman";
        st2.age=25;
        st2.psp=90.26;
        st2.batchName="Gamma Batch";

        st2.printStudentData();
        st2.changeBatch("Alpha Batch");
        st2.newBatch();

        //this shows that object of a class occupies memory and not a class
        //Every time a new object is created, a new memory is allocated to that object
    }
}