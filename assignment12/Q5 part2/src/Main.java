import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("set the pin number:");
        int pin = sc.nextInt();
        System.out.println("enter the amount to deposit:");
        int deposit = sc.nextInt();
        ATM atm = new ATM(deposit, pin);
        System.out.println("enter the pin number:");
        int checkPin = sc.nextInt();
        System.out.println("enter the amount to withdraw:");
        int withDraw = sc.nextInt();
        Thread t1 = new Thread(() -> atm.checkPin(checkPin));
        Thread t2 = new Thread(() -> atm.cashWithDrawal(withDraw));
        Thread t3=new Thread(()-> atm.checkBalance());
        Thread t4=new Thread(()-> atm.print());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}