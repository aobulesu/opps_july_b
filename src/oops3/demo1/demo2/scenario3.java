package oops3.demo1.demo2;

public class scenario3 {
    CCC c = new CCC();
}
class AAA{
    public AAA(){
        System.out.println("AAA");
    }
}
class BBB extends AAA{
    public BBB(String s){ // if BB is private: java: BB() has private access in oops3.demo1.demo2.BB
        System.out.println("BBB:" + s);
    }

    public BBB(String s, int i){ // if BB is private: java: BB() has private access in oops3.demo1.demo2.BB
        System.out.println("BBB:" + s);
    }

    public BBB() { // if BB is private: java: BB() has private access in oops3.demo1.demo2.BB
        System.out.println("NOT useful for few cases:");
    }
}
class CCC extends BBB{
    public CCC(){
       // super("hello"); //always write the super in first line. explicitly say call the parametised constructor form default consturctur.
        super("hello",10);
        System.out.println("CCC");
    }
}