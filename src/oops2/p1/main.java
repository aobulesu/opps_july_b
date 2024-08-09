package oops2.p1;

public class main {
    public static void main(String[] args) {
        student s = new student();
        s.psp=100;
        //s.age = 29; //java: age has private access in oops2.p1.student
        //s.printdetails(); //java: printdetails() has private access in oops2.p1.student
        System.out.println(s.psp);
    }
}