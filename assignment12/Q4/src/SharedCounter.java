public class SharedCounter implements Runnable{
    static int n=0;
    public synchronized void increment(){
        for(int i=1;i<=1000;i++){
            n++;
        }
    }
    public void run(){
        increment();
        //System.out.println("final value:"+n);
    }

    public int getN() {
        return n;
    }
}

