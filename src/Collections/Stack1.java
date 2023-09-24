package Collections;

import java.util.Stack;

/**
 * Stack offers just 3 functions. push(),pop() and peek(). But still we can use the methods of indexing
 * from the list class here as well. Why?
 * Reason: Since, Stack implements VECTOR and VECTOR in turn implements LIST. So, we can access those methods as well.
 */
public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> s1= new Stack<>();
        s1.add(2);
        s1.add(1);
        s1.add(5);

        System.out.println(s1);
        System.out.println(s1.peek());
    }
}
