public class Account {
    //account holder name,acc type,ifsc code

    private String accountType;
    private String ifscCode;

    public Account(String accountType, String ifscCode) {
        this.accountType = accountType;
        this.ifscCode = ifscCode;
    }


    public String getAccountType() {
        return accountType;
    }

    public String getIfscCode() {
        return ifscCode;
    }
}
