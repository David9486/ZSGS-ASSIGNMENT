public class ICICI extends RBI{
    double interestRate=8.4;
    double withdrawalLimit=75000;
    public ICICI(Customer c,Account a){
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
