package mca;
import java.util.Scanner;
public class banking {
    String name,acc_type;
    static int total_accounts=0;
    int balance=0;
    banking(String name){
        this.name=name;
        this.balance=0;
        this.acc_type="SB";
        total_accounts++;
    }
    banking(String name,int initial){
        this.name=name;
        this.balance=initial;
        this.acc_type="SB";
        total_accounts++;
    }
    banking(String name,int initial,String acc_type){
        this.name=name;
        this.balance=initial;
        this.acc_type=acc_type;
        total_accounts++;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited amount of RS : "+amount);
        }
        else {
            System.out.println("Invalid deposit");
        }
    }
    public void deposit(int amount,String tran_type){
        if(amount>0){
            if(tran_type.equals("cash")){
                balance+=amount;
                System.out.println("Deposit transaction of rupees "+amount+" done through cash");
            } else if (tran_type.equals("cheque")) {
                balance+=amount;
                System.out.println("Enter Cheque number : ");
                Scanner sc=new Scanner(System.in);
                String cheque=sc.nextLine();
                System.out.println("Enter Date : ");
                String date=sc.nextLine();
                System.out.println("Deposit transaction of rupees "+amount+" done through cheque no :"+cheque+" on "+date);
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else {
            System.out.println("Invalid deposit");
        }
    }
    public void details(){
        System.out.println("Account holder name : "+name);
        System.out.println("Account type : "+acc_type);
        System.out.println("Current balance : "+balance);
        System.out.println("\n====================================================\n");
    }
    public static void total_account(){
        System.out.println("Total number of account created : "+total_accounts);
    }
    public static void handle_deposit(banking account,Scanner sc){
        System.out.println("Do u want to make additional deposit yes/no :");
       String eval=sc.nextLine();
        if(eval.equals("yes")){
            System.out.println("Enter Amount for deposit : ");
            int add=sc.nextInt();
            sc.nextLine();
            System.out.println("Do u want to mention cash or cheque details yes/no : ");
            String eva2=sc.nextLine();
            if(eva2.equals("yes")){
                System.out.println("Enter the transaction type cash / cheque ");
                String dep_type=sc.nextLine();
                account.deposit(add,dep_type);
            }
            else {
                account.deposit(add);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Banking Application Platform");
        while (true){
        System.out.println("Enter the choice if you have : \n 1 : Account name \n 2 : Account name and Initial deposit \n 3 : Account Name,Initial deposit and Account type \n 4 : exit ");
        int choice=sc.nextInt();
        sc.nextLine();
        String  name,type;
        int inital;
        switch (choice){
            case 1:
                System.out.println("Enter your name : ");
                name=sc.nextLine();
                banking acc1=new banking(name);
                handle_deposit(acc1,sc);
                acc1.details();
                break;
            case 2:
                System.out.println("Enter your name : ");
                name=sc.nextLine();
                System.out.println("Enter initial deposit : ");
                inital=sc.nextInt();
                sc.nextLine();
                banking acc2=new banking(name,inital);
                banking.handle_deposit(acc2, sc);
                acc2.details();
                break;
            case 3:
                System.out.println("Enter your name : ");
                name=sc.nextLine();
                System.out.println("Enter initial deposit : ");
                inital=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter account type : ");
                type=sc.nextLine();
                banking acc3=new banking(name,inital,type);
                handle_deposit(acc3,sc);
                acc3.details();
                break;
            case 4:
                System.out.println("Thank you for using the Banking Application. Goodbye!");
                banking.total_account();
                System.exit(0);
        }
    }
    }
}
