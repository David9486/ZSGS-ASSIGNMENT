import java.util.ArrayList;

public class Store {
    static String storeName;
    static String storeLocation;
    public static void storeDetails(String storeName,String storeLocation){
        Store.storeName=storeName;
        Store.storeLocation=storeLocation;
    }
    public static void displayStoreDetails(){
        System.out.println("-------STORE DETAILS------");
        System.out.println("THE STORE NAME: "+storeName);
        System.out.println("THE STORE LOCATION: "+storeLocation);
    }
    ArrayList<Product>p=new ArrayList<>();
    public void addProduct(Product product){
            p.add(product);
    }
    public void displayAllProduct(){
        System.out.println("PRODUCT ID\t\t"+"PRODUCT NAME\t\t"+"PRICE\t\t"+"QUANTITY");
        System.out.println();
        for(Product pro:p){
            pro.displayProduct();
        }
    }
}
