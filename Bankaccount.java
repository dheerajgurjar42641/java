class Account {
    String name;
    int deposite;
    int account_no;
    int total_balance;
    String dob;
    public Account(String holdername,int depositee,int account_noo,int total_balancee,String dobb){
        name = holdername;
        deposite = depositee;
        account_no =account_noo;
        total_balance = total_balancee;
        dob = dobb;

    }
    void display(){
        System.out.println("name"+name+"dob"+dob+"balance"+total_balance+"deposite"+deposite);
    }
    
}
public class Bankaccount {
    public static void main(String[] args) {
        // Account obj = new Account();
        // obj.name = "ramu kaka";
        // obj.deposite = 1200;
        // obj.total_balance=1200000;
        // obj.account_no = 6543;
        // obj.dob = "12may2026";

        // System.out.println("name of customer  "+obj.name);
        // System.out.println("deposite amount by customer  "+obj.deposite);
        // System.out.println("total balance of ramu kaka   "+obj.total_balance);
        // System.out.println("the account no of ramu kaka is   "+obj.account_no);
        // System.out.println("date of birth   "+obj.dob);

        // Account obj1 = new Account();
        // obj1.name = "ramu kaka ki kaki";
        // obj1.deposite = 12000;
        // obj1.total_balance=120000;
        // obj1.account_no = 6543;
        // System.out.println("name of by ramu kaka ki kaki  "+obj1.name);
        // System.out.println("deposite amount by ramu kaka ki kaki "+obj1.deposite);
        // System.out.println("total balance of ramu kaka ki kaki   "+obj1.total_balance);
        // System.out.println("the account no of ramu kaka ki kaki is   "+obj1.account_no);
        Account account1 = new Account("harshu", 88, 700, 7000,"1976");
        account1.display();
        Account account2 = new Account("shyam", 76, 4, 440,"2009");
        account1.display();

    }
}
