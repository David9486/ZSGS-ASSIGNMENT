import java.util.InputMismatchException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int num1=Integer.parseInt(s1);
        //int num2=Integer.parseInt(s2);
        int div=0;
        try{
            System.out.println("enter the String number 1:");
            String s1= sc.next();
            System.out.println("enter the String number 2:");
            String s2=sc.next();
            System.out.println("enter the number 1: ");
            int n1=sc.nextInt();
            System.out.println("----input number format---");
            System.out.println("enter the number 2: ");
            int n2=sc.nextInt();
            System.out.println(s1);
            System.out.println(s2);
            int num1=Integer.parseInt(s1);
            int num2=Integer.parseInt(s2);
            div=num1/num2;
            System.out.println(div);
        }catch(InputMismatchException e){
            System.out.println("error:InputMismatchException "+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("error:ArithmeticException "+e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("error:NumberFormatException "+e.getMessage());
        }
    }
}