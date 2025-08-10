public abstract class RBI {
    Customer c;
    Account a;
    public RBI(Customer c,Account a){
        this.a=a;
        this.c=c;
    }
    private final static double withdrawalLimit = 100000;
    private final static double interestRate = 4.1;

    public abstract double getInterestRate();

    public abstract double getWithdrawalLimit();
    public void display(){
        System.out.println("CUSTOMER NAME: "+c.custName);
        System.out.println("ACCOUNT NUMBER: "+c.accNumber);
        System.out.println("DATE OF BIRTH: "+c.dateOfBirth);
        System.out.println("GENDER: "+c.gender);
        System.out.println("EMAIL ID: "+c.emailId);
        System.out.println("PHONE NUMBER: "+c.phoneNumber);
        System.out.println("ACCOUNT TYPE: "+a.getAccountType());
        System.out.println("IFSC CODE: "+a.getIfscCode());
        System.out.println("INTEREST RATE FOR SBI: "+getInterestRate());
        System.out.println("WITHDRAW LIMIT FOR SBI: "+getWithdrawalLimit());
    }
}

