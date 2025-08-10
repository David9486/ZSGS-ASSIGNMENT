//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Thread {
    public static void main(String[] args) {
        Runnable tr=new TaskRunner();
        Runnable tr1=new TaskRunner();
        Thread th=new Thread(tr,"thread1");
        Thread th2=new Thread(tr1,"thread2");
        th.start();
        th2.start();
    }
}