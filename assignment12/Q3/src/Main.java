//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Numbers num=new Numbers();
        Thread t1=new Thread(()->num.odd());
        Thread t2=new Thread(()->num.even());
        t1.start();
        t2.start();
    }
}