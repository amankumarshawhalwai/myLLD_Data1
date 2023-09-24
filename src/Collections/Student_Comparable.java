package Collections;

import org.jetbrains.annotations.NotNull;

/**
 * For natural ordering, we need to use COMPARABLE interface
 */
public class Student_Comparable implements Comparable<Student_Comparable> {
    String name;
    int id;
    int age;
    double psp;

    public Student_Comparable(String name, int id, int age, double psp) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.psp = psp;
    }

    @Override
    public String toString() {
        return "Student_Comparable{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", psp=" + psp +
                '}';
    }

    /**
     *  this <----> other
     *  this means the current object & other refers to the object to compare to
     *  <0 => Current Object is lesser than the other object. |RESULT: (this…other)|
     *  =0 => Current Object is equal to the other object. |RESULT: (this…Student) or (student…this)|
     *  >0 => Current Object is greater than the other object. |RESULT: (other…this)|
     */
    @Override
    //Let's consider name for comparison
    public int compareTo(@NotNull Student_Comparable other) {
        if(this.name.compareTo(other.name)<0)
            return -1;
        if(this.name.equals(other.name))
            return 0;
        return 1;
    }
}
