package oop2_accessmodifiers.package1;

public class Student {
    private String name;
    int batchId;// becomes default since no access modifiers used
    protected double psp;
    public String universityName;
    void changeBatchId(int newBatchId)
    {
        batchId=newBatchId;
        name="Aman";//same class
        batchId=5;// same class access
        psp=89.23;
    }
}
