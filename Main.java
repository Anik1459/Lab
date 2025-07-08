import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\n Menu");
        System.out.println("1.Create");
        System.out.println("2.Credit");
        System.out.println("3.Debit");
        System.out.println("4.Tranfer");
        System.out.println("5.Show account info");
        System.out.println("6.Exit");
   int choose=input.nextInt();
   input.nextLine();


        System.out.println("Choose accout type");
        System.out.println("1. Savings accout");
        System.out.println("2. Current Account");
        System.out.println("3. Deposit premium Account");
        System.out.println(("Enter your choice"));
        int choice = input.nextInt();

        input.nextLine();
        System.out.println("Enter your AccountId");
        String accountId = input.nextLine();
        System.out.println("Enter your AccountName");
        String accountName = input.nextLine();
        System.out.println("Password set");
       String password = input.nextLine();
        System.out.println("Enter initial balance");
        double initialBalance = input.nextDouble();
        input.nextLine();
        Account ac=null;
          if(choice==1){
              ac=new Current(accountId,accountName,password,initialBalance);
          }
          else if(choice==2){
              ac=new Savings(accountId,accountName,password,initialBalance);
          }
          else if (choice==3){
              ac=new Premium(accountId,accountName,password,initialBalance);
          }
          else{
              System.out.println("Invalid choice");
          }

          if(ac!=null){

          }
    }


}