package Entity;

public class Account {
    private String cartNumber;
    private String accountNumber;
    private  String shebaNumber;
    private int cvv2;
    private int expireMonth;
    private String expireYear;
    private double initialAmount;
    final String branchName="Tehran";
    final int branchCode=123;

    public Account() {
    }

    public String getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(String cartNumber) {
        this.cartNumber = cartNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getShebaNumber() {
        return shebaNumber;
    }

    public void setShebaNumber(String shebaNumber) {
        this.shebaNumber = shebaNumber;
    }

    public int getCvv2() {
        return cvv2;
    }

    public void setCvv2(int cvv2) {
        this.cvv2 = cvv2;
    }

    public int getExpireMonth() {
        return expireMonth;
    }

    public void setExpireMonth(int expireMonth) {
        this.expireMonth = expireMonth;
    }

    public String getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(String expireYear) {
        this.expireYear = expireYear;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public String getBranchName() {
        return branchName;
    }

    public int getBranchCode() {
        return branchCode;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cartNumber='" + cartNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", shebaNumber='" + shebaNumber + '\'' +
                ", cvv2=" + cvv2 +
                ", expireMonth=" + expireMonth +
                ", expireYear='" + expireYear + '\'' +
                ", initialAmount=" + initialAmount +
                ", branchName='" + branchName + '\'' +
                ", branchCode=" + branchCode +
                '}';
    }
}

