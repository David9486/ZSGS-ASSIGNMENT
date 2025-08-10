import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Store s=new Store();
       /* System.out.print("ENTER THE STORE NAME:");
        String name=sc.nextLine();
        System.out.print("ENTER THE STORE LOCATION:");
        String location=sc.nextLine();
        Store.storeDetails(name,location);
        Store.displayStoreDetails();*/
        System.out.println("1.PRODUCT DETAILS\n"+"2.EXIT");
        System.out.println("enter your choice:");
        switch(sc.nextInt()){
            case 1:
            System.out.println("-------ENTER THE PRODUCT DETAILS-----");
            System.out.print("ENTER THE PRODUCT ID:");
            int id=sc.nextInt();
            System.out.println("ENTER THE PRODUCT NAME:");
            String proName=sc.next();
            System.out.print("ENTER THE PRODUCT PRICE:");
            int price= sc.nextInt();
            System.out.print("ENTER THE QUANTITY:");
            int qua= sc.nextInt();
            s.addProduct(new Product(id,proName,price,qua));
            s.displayAllProduct();
            case 2:
                break;
        }

    }
}