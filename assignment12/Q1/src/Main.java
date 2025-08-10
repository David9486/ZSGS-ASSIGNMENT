//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            MyThread t = new MyThread();
            MyThread t1=new MyThread();
            t.start();
            t1.start();
    }
}