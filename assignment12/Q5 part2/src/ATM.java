import static java.lang.Thread.sleep;

public class ATM {
    int balance;
    int pin;
    int withDraw;
    int step=1;
    public ATM(int balance,int pin){
        this.balance=balance;
        this.pin=pin;
    }
    public synchronized void checkPin(int atmPin){
        try {
            while (step != 1) {
                wait();
            }
            if (pin == atmPin) {
                System.out.println("PIN AUTHENTICATION SUCCESSFUL");
                step=2;
                notifyAll();
            } else {
                System.out.println("INCORRECT PIN");
                System.exit(0);
            }
            sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public synchronized void cashWithDrawal(int amount){
        try {
            while(step!=2) {
                wait();
            }if (amount <=balance) {
                balance -= amount;
                withDraw = amount;
                step=3;
                notifyAll();
            }
            else System.out.println("INSUFFICENT BALANCE");
            sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
    public synchronized void checkBalance(){
        try {
            while (step!=3) {
                wait();
            }
            System.out.println("THE CURRENT BALANCE: "+balance);
            step=4;
            notifyAll();
        sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
    public synchronized void print(){
        try {
            while(step!=4) {
                wait();
            }
                System.out.println("======Receipt=====");
                System.out.println("WITHDRAW AMOUNT: " + withDraw);
                System.out.println("CURRENT BALANCE: " + balance);
            sleep(4000);
        } catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
