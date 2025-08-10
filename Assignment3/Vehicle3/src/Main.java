import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE VEHICLE ID:");
        String id=sc.nextLine();
        System.out.print("ENTER THE BRAND NAME:");
        String name=sc.nextLine();
        System.out.println("ENTER THE PRICE:");
        double price= sc.nextInt();
        Vehicle v1=new Vehicle(id,name,price);
        Vehicle v2=new Vehicle(id,name,price);
        System.out.println("THE NUMBER VEHICLES CREATED SO FAR: "+Vehicle.count);
    }
}