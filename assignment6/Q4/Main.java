import Travel.User;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the user name: ");
        String name=sc.nextLine();
        System.out.println("enter the email id: ");
        String email=sc.nextLine();
        System.out.println("enter the gender: ");
        String gen=sc.nextLine();
        User u=new User(name,email,gen);
        u.ticDetails();

    }
}