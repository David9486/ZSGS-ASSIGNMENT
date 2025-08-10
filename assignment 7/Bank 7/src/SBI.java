public class SBI extends RBI{
    double interestRate=9.6;
    double withdrawalLimit=80000;
    public SBI(Customer c,Account a){
       super(c,a);
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }
}
