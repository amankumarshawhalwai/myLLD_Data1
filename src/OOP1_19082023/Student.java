package OOP1_19082023;

public class Student {
    String name;
    String batchName;
    int age;
    double psp;

    void printStudentData()
    {
        System.out.println("Student's Data");
        System.out.println("Name: "+name);
        System.out.println("Current Batch: "+batchName);
        System.out.println("Age: "+age);
        System.out.println("PSP: "+psp);
        System.out.println("-------------------------------");
    }
    void changeBatch(String newBatchName)
    {
        batchName=newBatchName;
        //System.out.println("The new batch is: "+batchName);
    }
    void newBatch()
    {
        System.out.println("Student's new batch is: "+batchName);
    }
}
