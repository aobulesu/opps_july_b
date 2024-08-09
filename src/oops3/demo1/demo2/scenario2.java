package oops3.demo1.demo2;

public class scenario2 {
    public static void main(String[] args) {
        CC c= new CC();
    }
}

class AA{
    public AA(){
        System.out.println("AA");
    }
}
class BB extends AA{
    public BB(){ // if BB is private: java: BB() has private access in oops3.demo1.demo2.BB
        System.out.println("BB");
    }
}
class CC extends BB{
    public CC(){
        System.out.println("CC");
    }
}