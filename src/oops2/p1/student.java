package oops2.p1;

    public class student {
    private int age;
    public float psp;
    protected String name; //1.same class and chaild class in a same package 2.chaild calss in anpother package.

    public student() {
        age=10;
        psp=100;
        name="good";
    }
    void changeBatch() {
        age++;
        System.out.println("Changing batch");
    }
    void joinClass(){
        System.out.println(name +" is joining class");
    }

    private void printdetails(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("psp:" + psp);
    }
}