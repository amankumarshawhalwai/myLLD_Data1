package generics;
import java.util.*;
public class Pair1<FIRST, SECOND> {
    /**
     * Convention to keep the types in upper case
     */
    private FIRST first;
    private SECOND second;
    public Pair1(FIRST first,SECOND second)
    {
        this.first=first;
        this.second=second;
    }
    public FIRST getFirst()
    {
        return first;
    }
    public SECOND getSecond()
    {
        return second;
    }
    public void doSomething(String greeting)
    {
        System.out.println(greeting);
        System.out.println(first);
        System.out.println(second);
    }
    public void printMoreFirst(List<FIRST> firsts)
    {
        for(FIRST f:firsts){
            System.out.println(f);
        }
    }
}
