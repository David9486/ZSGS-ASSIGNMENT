//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            ProducerConsumer pc = new ProducerConsumer();
            Thread t1 = new Thread(() -> pc.producer());
            Thread t2 = new Thread(() -> pc.consumer());
            t1.start();
            t2.start();

        } catch (Exception e) {
            e.getMessage();
        }
    }
}