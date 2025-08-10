import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) throws CustomException{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age:");
        int age=sc.nextInt();
        try{
            if(age<=18){
                throw new CustomException();
            }
            else{
                System.out.println("you're eligible to vote");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}