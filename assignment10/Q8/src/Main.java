import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Account>acc=new ArrayList<Account>();
        acc.add(new Account(100,"David",1000));
        acc.add(new Account(101,"Alan",1500));
        acc.add(new Account(102,"Brad",2000));
        System.out.println("1.David\n"+"2.Alan\n"+"3.Brad\n");
        System.out.println("enter your choice:");
        switch(sc.nextInt()){
            case 1:
             acc.get(0).rateOfInterest();
             acc.get(0).display();
             break;
            case 2:
                acc.get(1).rateOfInterest();
                acc.get(1).display();
                break;
            case 3:
                acc.get(2).rateOfInterest();
                acc.get(2).display();
                break;
            default:System.out.println("enter the correct choice");
        }
    }
}