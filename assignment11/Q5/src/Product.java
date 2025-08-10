import java.io.Serializable;

public class Product implements Serializable {
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
    public String toString(){
        return "productId: "+productId+", "+"name: "+name+", "+"price: "+price+", "+"quantity: "+quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
