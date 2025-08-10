import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee emp=null;
        System.out.println("1.FullTimeEmployee\n"+"2.PartTimeEmployee\n"+"3.exit\n");
        System.out.println("enter the choice:");
        switch(sc.nextInt()){
            case 1:
                System.out.println("enter the amount:");
                int amt=sc.nextInt();
                System.out.println("enter the deduction amount:");
                int ded=sc.nextInt();
                emp=new FullTimeEmployee(amt,ded);
                emp.calculateSalary();
                break;
            case 2:
                System.out.println("enter the wages per day:");
                int wages=sc.nextInt();
                System.out.println("enter the hours worked per day:");
                int hour=sc.nextInt();
                emp=new PartTimeEmployee(wages,hour);
                emp.calculateSalary();
                break;
            case 3:
                break;
            default: System.out.println("enter the correct option");
        }
    }
}