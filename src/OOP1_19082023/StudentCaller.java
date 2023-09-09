package OOP1_19082023;

public class StudentCaller {
    public static void main(String[] args) {
        Student st1= new Student();
        st1.name="Aman";
        st1.age=25;
        st1.psp=90.26;
        st1.batchName="Beta Batch";

        st1.printStudentData();
        st1.changeBatch("Alpha Batch");
        st1.newBatch();
    }
}