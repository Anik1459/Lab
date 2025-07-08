public class Savings extends Account {
    public double initialBalance;
    public Savings(String accountId, String accountName, String password, double balance) {
        super(accountId, accountName, password);
        this.initialBalance = balance;
        super.credit(initialBalance+=initialBalance*.025);

    }
    public Savings(String accountId, String accountName, String password) {
        super(accountId, accountName, password);
        this.initialBalance = 0.0;
        super.credit(initialBalance += initialBalance * .025);

    }
     public double credit(double amount) {
        if(amount>0){
            double principal =( getBalance()+amount)*.025;
        return super.credit(principal );}
        else{
            return getBalance();
        }
     }

        @Override
    public double debit(double ammount) {
        if(getBalance()-ammount>=1000 && ammount>0){
        return super.debit(ammount);}
        else{
            System.out.println("You don't have enough money");
            return getBalance();
        }
    }


    public double transferFunds(double ammount, Account account) {
        if(ammount>0 && getBalance()-ammount>=1000){
        super.debit(ammount);
        account.credit(ammount);
        }
        else{
            System.out.println("You don't have enough money");}
            return  getBalance();

    }

    @Override
    public String toString() {

        return "Account= \n id" + getAccountId() + " accountName=" + getAccountName() + ", balance=" + getBalance();
    }
}
