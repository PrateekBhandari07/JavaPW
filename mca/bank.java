package mca;
import java.util.Scanner;
public class bank {
    int balance;
    static int total_accounts=0;
    String name,type;
    bank(String name){
        this.name=name;
        balance=0;
        type="SB";
        total_accounts++;
    }
    bank(String name, int deposit){
        this.name=name;
        this.balance=deposit;
        type="SB";
        total_accounts++;
    }
    bank(String name, int deposit,String type){
        this.name=name;
        this.balance=deposit;
        this.type=type;
        total_accounts++;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited "+amount+" Current balance : "+balance);
        }
        else {
            System.out.println("Invalid Deposit");
        }
    }
    public void deposit(int amount,String transactionType){
        if(amount>0){
            if(transactionType.equals("cash")){
                balance+=amount;
                System.out.println("Deposited "+amount+" Via cash and  Current balance : "+balance);
            } else if (transactionType.equals("cheque")) {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter Cheque number : ");
                String cheque_no=sc.nextLine();
                System.out.println("Enter Cheque issued date : ");
                String date=sc.nextLine();
                balance+=amount;
                System.out.println("Deposited "+amount+" Via cheque (Cheque No)"+cheque_no+ ", Date : "+date);
                System.out.println("Current Balance : "+balance);

            }
            else {
                System.out.println("Invalid Deposit");
            }
        }
        else {
            System.out.println("Invalid Deposit");
        }
    }
    public void displayAccountDetails(){
        System.out.println("Account Name : "+name);
        System.out.println("Account Type : "+type);
        System.out.println("Balance : "+balance);
        System.out.println("\n");
    }
    public static void displaytotalaccounts(){
        System.out.println("Total Accounts Created : "+total_accounts);
    }
    public static void main(String[] args) {
            bank ac1=new bank("Rakesh");
            bank ac2=new bank("Mukesh",500);
            bank ac3=new bank("Sukesh",800,"SB");

            ac1.deposit(1000);
            ac1.displayAccountDetails();
            ac2.deposit(200,"cash");
            ac2.displayAccountDetails();
            ac3.deposit(300,"cheque");
            ac3.displayAccountDetails();

            bank.displaytotalaccounts();
    }
}
