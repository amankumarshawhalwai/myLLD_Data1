package oop1_intro;
import java.util.*;
public class RectangleCaller {
    //Main method for calling the point and rectangle classes and its nethods
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length:");
        int length= sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth= sc.nextInt();

        //Rectangle rect= new Rectangle();
        //Method for getting the perimeter of the rectangle
        int ans1= new Rectangle().getPerimeter(length,breadth);
        System.out.println("The perimeter is= "+ans1);

        //Method for get the leftmost point on the passed length and breadth
        Point ans2= new Rectangle().getPoint(length,breadth);
        System.out.println("The left coordinate is= "+ans2);
    }
}