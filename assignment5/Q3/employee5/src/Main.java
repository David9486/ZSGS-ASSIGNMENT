import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.FULL TIME EMPLOYEE\n"+"2.PART TIME EMPLOYEE\n"+"3.EXIT");
        System.out.println("enter your choice:");
        switch(sc.nextInt()){
            case 1:
                System.out.println("enter the base salary:");
                double salary=sc.nextDouble();
                System.out.println("enter the deduction amount:");
                int deduction=sc.nextInt();
                Employee emp1=new FullTimeEmployee(salary,deduction);
                emp1.calculateSalary();
                break;
            case 2:
                System.out.println("enter the wages amount: ");
                int wages=sc.nextInt();
                System.out.println("enter the number of hours worked per day:");
                int hours=sc.nextInt();
                Employee emp2=new PartTimeEmployee(wages,hours);
                emp2.calculateSalary();
                break;
            case 3:
                break;
            default: System.out.println("enter the correct choice");
        }
    }
}