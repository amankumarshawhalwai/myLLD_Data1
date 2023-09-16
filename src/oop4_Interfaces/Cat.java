package oop4_Interfaces;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat Eats");
    }

    @Override
    public void run() {
        System.out.println("Cat Runs");
    }

    @Override
    public void sleep() {
        System.out.println("Cat Sleeps");
    }

    @Override
    public void walk() {
        System.out.println("Cat walks");
    }
    public void voice()
    {
        System.out.println("Cat mews");
    }
}
