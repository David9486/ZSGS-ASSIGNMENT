public class UPIPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("----UPI PAYMENT----");
        System.out.println(amount);
        System.out.println("TRANSACTION VIA UPI SUCCESSFUL");
    }

}
