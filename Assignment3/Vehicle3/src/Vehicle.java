public class Vehicle {
    String vehicleId;
    String brandName;
    double price;
    static int count=0;

    public Vehicle(String vehicleId, String brandName, double price) {
        this.vehicleId = vehicleId;
        this.brandName = brandName;
        this.price = price;
        count++;
    }
}
