public class Payment {
    private int transactionId;
    private int amount;
    private String payerName;
    private String payeeName;
    private String paymentMethod;
    private String status;



    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName=payeeName;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    public void displayDetails(int transactionId,int amount,String payerName,String payeeName,String paymentMethod,String status){
        System.out.println("---------PAYMENT DETAILS----------");
        System.out.println("TRANSACTION ID :"+getTransactionId());
        System.out.println("AMOUNT FOR TRANSACTION: "+getAmount());
        System.out.println("PAYER_NAME: "+getPayerName());
        System.out.println("PAYEE_NAME:"+getPayeeName());
        System.out.println("PAYMENT_METHOD: "+getPaymentMethod());
        System.out.println("STATUS: "+getStatus());

    }
}
