package oops3.demo1.demo2;

public class scenario {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        System.out.println("B");
    }
}
class C extends B{
    public C(){
        System.out.println("C");
    }
}