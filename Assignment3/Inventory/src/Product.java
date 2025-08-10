public class Product {
int productId;
String name;
int price;
int quantity;

    public Product(int productId, String name, int price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayProduct(){
        System.out.println(productId+"\t\t\t\t"+name+"\t\t\t\t"+price+"\t\t"+quantity);
    }
}
