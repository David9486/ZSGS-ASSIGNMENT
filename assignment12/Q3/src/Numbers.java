public class Numbers extends Thread{
    boolean flag=false;
    public synchronized void odd(){
        for(int i=1;i<=20;i++) {
            while(flag){
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(i);
            flag=true;
            notify();

        }
    }
    public synchronized void even(){
        for(int i=2;i<=20;i++) {
            while(!flag){
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(i);
            flag=true;
            notify();

        }
    }
}
