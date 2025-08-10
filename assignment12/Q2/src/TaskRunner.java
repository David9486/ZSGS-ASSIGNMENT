import static java.lang.Thread.sleep;

public class TaskRunner implements Runnable{
    @Override
    public void run(){
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " im running currently");
                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
