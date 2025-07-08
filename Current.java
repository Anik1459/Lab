public class Current extends Account{
 private double initialBalance=0.0;


    public Current(String accountId, String accountName, String password, double balance) {
        super(accountId, accountName, password);
        this.initialBalance = balance;
        super.credit(initialBalance);
    }
    public double debit(double ammount){
        if(ammount<=(getBalance()+initialBalance )){
           return  super.debit(ammount);
        }
        else{
        return  getBalance();}

    }
    public double transferFunds(double ammount, Account account) {
        if(ammount>0 && getBalance()-ammount>=0){
            super.debit(ammount);
            account.credit(ammount);
        }
        else{
            System.out.println("You don't have enough money");}
        return  getBalance();

    }
    public String toString() {

        return "Account= \n id" + getAccountId() + " accountName=" + getAccountName() + ", balance=" + getBalance();
    }


}
