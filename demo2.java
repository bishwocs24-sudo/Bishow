class account{
    String customer_name;
    String account_number;
    String type_account;
    double balance;
    
    public void getdetails(){
        System.out.println("Customer Name: "+customer_name);
        System.out.println("Account Number: "+account_number);
        System.out.println("Account Type: "+type_account);
        System.out.println("Balance: "+balance);
        
    }
}
class cur_account extends account{
    double minimum_balance1=500.0;
    double penalty=100.0;
    void withdraw(double amount){
        if(balance-amount<minimum_balance1){
            System.out.println("Insufficent Balance");
            System.out.println("Penalty was applied");
            balance=balance-penalty;
        }else{
            balance=balance-amount;
            System.out.println("Withdraw rupees "+amount+" is debited");
            System.out.println("Current Balance is: "+balance);
        }
    }
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Current Balance after deposit rupees "+amount+"is: "+balance);
    }
}
class sav_account extends account{
    double minimum_balance1=500.0;
    double penalty=100.0;
    double interest=6.0;
    void withdraw(double amount){
        if(balance-amount<minimum_balance1){
            System.out.println("Insufficent Balance");
            System.out.println("Penalty was applied");
            balance=balance-penalty;
        }else{
            balance=balance-amount;
            System.out.println("Withdraw rupees "+amount+" is debited");
            System.out.println("Current Balance is: "+balance);
        }
    }
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Current Balance after deposit rupees "+amount+"is: "+balance);
    }
    void addintrest(){
        balance=balance+balance*interest/100;
        System.out.println("Current Balance after Adding Intrest(6%) is: "+balance);
    }

}
class demo2{
    public static void main(String[] args) {
        sav_account sa = new sav_account();
        sa.customer_name = "Alice";
        sa.account_number = "S123";
        sa.type_account = "Savings";
        sa.balance = 1000;

        sa.getdetails();
        sa.deposit(500);
        sa.withdraw(200);
        sa.addintrest();

        cur_account ca = new cur_account();
        ca.customer_name = "Bob";
        ca.account_number = "C456";
        ca.type_account = "Current";
        ca.balance = 2000;

        ca.getdetails();
        ca.deposit(1000);
        ca.withdraw(1800);
    }
}