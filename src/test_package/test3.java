package test_package;
import java.util.*;
public class test3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("The result is= "+sum);
        System.out.println("Pushing test3 to git round3");
    }
}