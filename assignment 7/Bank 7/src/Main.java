import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Customer cust=new Customer("DAVID",1200000340,"6.9.2003","MALE","davidraja76399@gmail.com",960032540);
    Account acc=new Account("SAVINGS","SBI12094");
    RBI bank=null;
    while(true){
        System.out.println("1.SBI\n"+"2.ICICI\n"+"3.Exit\n");
        System.out.println("enter your choice:");
        switch(sc.nextInt()){
            case 1:
                System.out.println("----SBI BANK DETAILS-----");
                bank=new SBI(cust,acc);
                bank.display();
                break;
            case 2:
                System.out.println("----ICICI BANK DETAILS-----");
                bank=new ICICI(cust,acc);
                bank.display();
                break;
            case 3:
                System.exit(0);
            default: System.out.println("enter the correct option");


        }
    }
    }
}