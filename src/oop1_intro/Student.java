package oop1_intro;
//Student class to be called by StudentCaller
public class Student {
    String name;
    String batchName;
    int age;
    double psp;

    //Used for printing the Student's data
    void printStudentData()
    {
        System.out.println("Student's Data");
        System.out.println("Name: "+name);
        System.out.println("Current Batch: "+batchName);
        System.out.println("Age: "+age);
        System.out.println("PSP: "+psp);
        System.out.println("-------------------------------");
    }
    //Method to change the batch
    void changeBatch(String newBatchName)
    {
        batchName=newBatchName;
        //System.out.println("The new batch is: "+batchName);
    }
    //Method to print the new updated batch name
    void newBatch()
    {
        System.out.println("Student's new batch is: "+batchName);
    }
}
