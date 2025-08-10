public class DebitCardPayment implements PaymentMethod {
    public void pay(double amount){
        System.out.println("----DEBIT CARD PAYMENT----");
        System.out.println(amount);
        System.out.println("TRANSACTION VIA DEBIT CARD SUCCESSFUL");
    }

}
