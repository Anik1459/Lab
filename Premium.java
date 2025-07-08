public class Premium extends Account {
    private double initialBalance;
 private int creditCount=0;
    public Premium(String accountId, String accountName, String password, double balance) {
        super(accountId, accountName, password, balance);
        initialBalance = balance;
        super.credit(initialBalance+=initialBalance*.07);

    }
    public Premium(String accountId, String accountName, String password) {
        super(accountId, accountName, password);
        initialBalance = 0.0;
        super.credit(initialBalance+=initialBalance*.07);
    }
    public double credit(double amount) {
        if(amount>0){
            double principle=(amount+getBalance())*.07;
            creditCount++;
            return super.credit(principle+getBalance());

        }
        else{
            return getBalance();
        }
    }
    public double debit(double amount) {
        if(amount>0 && creditCount>=5 && getBalance()>=amount){
          return  super.debit(getBalance()-amount);
        }
        else{
            System.out.println("Insufficient balance");
            return getBalance();
        }
    }

    public String toString() {

        return "Account= \n id" + getAccountId() + " accountName=" + getAccountName() + ", balance=" + getBalance();
    }



}
