package oops3.demo1.demo3;

public class main {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("debug");
        A a = c;
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(c.c);
       // System.out.println(a.c); //parent class dont have access for c which is in chaild class b.
    }
}

class A{
    int a,b;
}

class B extends A{
    int c;
}

class C extends B{
    int d;
}