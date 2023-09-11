package oop3_inheritancePolymorphism;

public class C  extends B{
    public C()
    {
        super("You are in B Class");
        System.out.println("Constructor of C");
    }
    public C(String greet)
    {
        super("You are in B Class");
        System.out.println(greet);
    }
    public C(String greet, int count)
    {
        super("You are in B Class");
        System.out.println(greet+". This is the "+count+" time");
    }

}
