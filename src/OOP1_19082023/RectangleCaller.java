package OOP1_19082023;
import java.util.*;
public class RectangleCaller {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length:");
        int length= sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth= sc.nextInt();

        //Rectangle rect= new Rectangle();
        int ans1= new Rectangle().getPerimeter(length,breadth);
        System.out.println("The perimeter is= "+ans1);

        Point ans2= new Rectangle().getPoint(length,breadth);
        System.out.println("The left coordinate is= "+ans2);
    }
}