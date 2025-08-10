public class MyThread extends Thread{

    @Override
    public void run(){
        try {
            for (int i = 1; i <= 5; i++) {
                sleep(500);
                System.out.println(Thread.currentThread().getName() + "hello everyone!");
                sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
