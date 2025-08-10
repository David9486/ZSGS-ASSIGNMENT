//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException{
        try {
            Runnable r1=new SharedCounter();
            Runnable r2 =new SharedCounter();
            Runnable r3=new SharedCounter();
            Thread t1 = new Thread(r1);
            Thread t2 = new Thread(r2);
            Thread t3 = new Thread(r3);
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();


            t3.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    System.out.println("the final value: "+SharedCounter.n);
    }
}