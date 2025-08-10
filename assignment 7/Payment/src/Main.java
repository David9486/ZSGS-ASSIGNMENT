import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount:");
        double amt=sc.nextDouble();
        System.out.println("enter your choice: ");
        PaymentMethod payment=null;
        System.out.println("1.CreditCardPayment\n"+"2.DebitCardPayment\n"+"3.UPIPayment\n"+"4.exit");
        switch(sc.nextInt()){
            case 1:
                payment=new CreditCardPayment();
                payment.pay(amt);
                break;
            case 2:
                payment=new DebitCardPayment();
                payment.pay(amt);
                break;
            case 3:
                payment=new UPIPayment();
                payment.pay(amt);
                break;
            case 4:
                break;
            default: System.out.println("enter the correct option");



        }
    }
}