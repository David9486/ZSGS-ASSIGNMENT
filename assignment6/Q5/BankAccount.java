public class BankAccount {
    private long accountNumber;
    private String name;
    private int balance=0;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amt){
        balance+=amt;
    }

    public int withDraw(int amt){
        if(amt>balance){
            System.out.println("insufficent balance please deposit first!");
        }
        else{
            balance-=amt;
        }
        return amt;
    }
    public void display(){
        System.out.println("--------ACCOUNT DETAILS-------");
        System.out.println("ACCOUNT NUMBER: "+accountNumber);
        System.out.println("ACCOUNT HOLDER'S NAME: "+name);
    }



}
        //account number, account holder name, and balance