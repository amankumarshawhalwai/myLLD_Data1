package test_package;

public class Client {
    public static void main(String[] args) {
        P obj = new C();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
        obj.fun();
        obj.sfun();

        /**
         Scenario 1:  P obj = new P();
         Explanation: Since, an object of the P class is created so all those methods of the P class are called.
         Scenario 2:  P obj = new C();
         Explanation: Since, an object of the P class is created so all the method of P is called and if anyone is present
         is not present in P but is in C so that is called.
         Scenario 3:  C obj = new P();
         Explanation: Since, C is itself a child class of P so an object of that cannot be created(Need to confirm).
         Scenario 4:  C obj = new C();
         Explanation: Since, an object of the C class is created and so all properties of C are accessed.
         **/
    }
}