package testPackage;
import java.util.*;
public class test5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range");
        int t=sc.nextInt();
        int s=0;
        for(int i=1;i<=t;i++)
        {
            s+=i;
        }
        System.out.println("The sum is = "+s);
    }
}
