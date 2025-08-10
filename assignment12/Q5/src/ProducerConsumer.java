import java.util.ArrayList;

public class ProducerConsumer {
    ArrayList<Integer>arr=new ArrayList<>();
    int limit=5;
    public synchronized void producer(){
        int n=1;
        //int i=0;
        try{
            while(arr.size()!=limit){
                arr.add(n);
                System.out.println("produced: "+n);
                n++;
                notify();
            }
            wait();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public synchronized void consumer(){
        int i=0;
        try{
            while(i++<limit){
                if(arr.isEmpty()){
                    wait();
                }
                int remove=arr.remove(0);
                System.out.println("removed: "+remove);
                notify();
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
