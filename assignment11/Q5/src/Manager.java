import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    Scanner sc=new Scanner(System.in);
    Product p;


    ArrayList<Product>arr=new ArrayList<>();
    String path="C:\\Users\\david\\OneDrive\\Desktop\\products.dat";
    public void addProd() throws IOException {
        System.out.println("enter how many product:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\renter the product " + (i+1) + " id:");
            int id = sc.nextInt();
            System.out.println("\renter the name of the product" + (i+1) + " :");
            String name = sc.next();
            System.out.println("\renter the price of the product" + (i+1) + " :");
            int price = sc.nextInt();
            System.out.println("\renter the quantity of the product" + (i+1) + " :");
            int quantity = sc.nextInt();
            this.p = new Product(id, name, price, quantity);
            arr.add(p);
        }
            try (FileOutputStream fo = new FileOutputStream(path);
                 ObjectOutputStream ob = new ObjectOutputStream(fo)) {
                ob.writeObject(arr);
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
    public void viewProd() throws IOException{
        //String path="C:\\Users\\david\\OneDrive\\Desktop\\products.dat";
        try(FileInputStream fi=new FileInputStream(path);
        ObjectInputStream ob=new ObjectInputStream(fi)){
            ArrayList prod=(ArrayList<Product>) ob.readObject();
            System.out.println(prod);
        }catch(IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public void updateProd() throws IOException{
        //String path="C:\\Users\\david\\OneDrive\\Desktop\\products.dat";
        try(FileInputStream fi=new FileInputStream(path);
            ObjectInputStream ob=new ObjectInputStream(fi)){
            ArrayList<Product>prod=(ArrayList<Product>) ob.readObject();
            System.out.println("enter the target id:");
            int target=sc.nextInt();
            boolean flag=false;
            for(Product p:prod) {
                if (p.getProductId() == target) {
                    System.out.println("enter the new price for the product:");
                    int newPrice = sc.nextInt();
                    System.out.println("enter the new quantity for the product:");
                    int newQuantity = sc.nextInt();
                    p.setPrice(newPrice);
                    p.setQuantity(newQuantity);
                    flag = true;
                    break;
                }
            }
                if(flag){
                    System.out.println("the product id is found and updated the price and quantity");
                    try(FileOutputStream fo=new FileOutputStream((path));
                        ObjectOutputStream obj=new ObjectOutputStream(fo)){
                            obj.writeObject(prod);
                        }
                }
                else{
                    System.out.println("the product id is not found");
                }

        }catch(IOException|ClassNotFoundException e){
            e.printStackTrace();
        }

    }
    public void deleteProd() throws IOException {
        try (FileInputStream fi = new FileInputStream(path);
             ObjectInputStream oj = new ObjectInputStream(fi)) {
            ArrayList<Product> del = (ArrayList<Product>) oj.readObject();
            System.out.println("enter the target id:");
            int target = sc.nextInt();
            boolean flag = false;
            flag=del.removeIf(p->p.getProductId()==target);
            if (flag) {
                System.out.println("the target id found!! and deletion on progress");
                try (FileOutputStream fo = new FileOutputStream(path);
                     ObjectOutputStream ob = new ObjectOutputStream(fo)) {
                    ob.writeObject(del);
                    System.out.println("deletion done successfully");
                }
            } else {
                System.out.println("the id mentioned is not in file:");
            }
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

