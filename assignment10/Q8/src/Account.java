import java.util.Scanner;

public class Account {
    int accountNumber;
    String name;
    Double balance;
    double rate_interest;
    double bal;
    Scanner sc=new Scanner(System.in);
    public Account(int accountNumber,String name,double balance){
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;//Autoboxing conversion
    }
    public void rateOfInterest(){
        bal=balance;//unboxing conversion
        System.out.println("enter the interest percent:");
        int percent=sc.nextInt();
        System.out.println("enter the time period:");
        int time=sc.nextInt();
        rate_interest=(percent*bal*time)/100;
        bal=bal+rate_interest;
        Double interest=Double.valueOf(rate_interest);//manual boxing conversion
        //System.out.println("the interest is: "+rate_interest);
        balance=bal;
    }
    public void display(){
        System.out.println("the account holder's name: "+name);
        System.out.println("the account number: "+accountNumber);
        System.out.println("the current balance: "+balance);
        System.out.println("the newly updated balance:"+bal);
    }
}
