public class Account {
    private String accountId;
    private String accountName;
    private double balance ;
    private String password;

    // Constructor
    public Account(String accountId, String accountName, String password, double balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.password = password;
        this.balance = balance;
    }
    public Account(String accountId, String accountName, String password) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.password = password;
        balance = 0.0;
    }
    public String getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
    public double credit(double ammount) {
        if(ammount > 0) {
        balance += ammount;}

        else {
            System.out.println(" balance can't be negative");
        }
        return   balance;
    }
    public double debit(double ammount) {
        if(ammount > 0 && balance >= ammount) {
        balance -= ammount;}
        else{
            System.out.println("Insufficient Balance");
        }
        return   balance;
    }


    @Override
    public String toString() {
        return "Account= \n id" + accountId + ", accountName=" + accountName + ", balance=" + balance;
    }
}
