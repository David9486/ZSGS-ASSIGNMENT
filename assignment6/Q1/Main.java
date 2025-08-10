//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*1. Illustrate the concept-Encapsulation with the Payment Gateway System.
    [The class should encapsulate private data members such as transaction ID, payer name, payee name, amount,
    payment method, and transaction status.
        Provide appropriate public getter and setter methods to access and modify these details securely.
                Also include a method to display the transaction summary.]*/
        Payment pay1=new Payment();
        pay1.setTransactionId(10034);
        pay1.setAmount(500000);
        pay1.setPayerName("DAVID");
        pay1.setPayeeName("FLIPKART");
        pay1.setPaymentMethod("CREDIT_CARD");
        pay1.setStatus("SUCCESSFUL");
        pay1.displayDetails(pay1.getTransactionId(),pay1.getAmount(),pay1.getPayerName(), pay1.getPayeeName(), pay1.getPaymentMethod(),pay1.getStatus());
        Payment pay2=new Payment();
        pay2.setTransactionId(100554);
        pay2.setAmount(550000);
        pay2.setPayerName("MAX");
        pay2.setPayeeName("AMAZON");
        pay2.setPaymentMethod("UPI");
        pay2.setStatus("PENDING");
        pay2.displayDetails(pay2.getTransactionId(),pay2.getAmount(),pay2.getPayerName(), pay2.getPayeeName(), pay2.getPaymentMethod(),pay2.getStatus());

    }
}
