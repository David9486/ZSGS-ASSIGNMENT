import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the account number: ");
        ba.setAccountNumber(sc.nextLong());
        System.out.println("enter the account holder's name: ");
        ba.setName(sc.next());
        ba.display();
        System.out.println("enter the amount to deposit: ");
        int depo=sc.nextInt();
        ba.deposit(depo);
        System.out.println("enter the amount to withdraw: ");
        int with= sc.nextInt();
        ba.withDraw(with);
        System.out.println("the final balance after withdraw: "+ba.getBalance());
    }
}