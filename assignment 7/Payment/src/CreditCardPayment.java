public class CreditCardPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("----CREDIT CARD PAYMENT----");
           System.out.println(amount);
           System.out.println("TRANSACTION VIA CREDIT CARD SUCCESSFUL");
    }
}
