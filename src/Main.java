//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        studentfunc one = new studentfunc();
        one.name = "obulesu";
        one.psp = 100;
        one.age = 29;
        one.changeBatch();
        one.joinClass();
        one.printdetails();

        studentfunc two = new studentfunc();
        two.name = "Aarav";
        two.psp = 100;
        two.age = 28;
        two.changeBatch();
        two.joinClass();
        two.printdetails();
    }
}