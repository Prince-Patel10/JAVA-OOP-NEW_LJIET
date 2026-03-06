abstract class bank
{
    int acc_no;
    String name;
    double balance;

    bank(int acc_no,String name,double balance)
    {
        this.acc_no= acc_no;
        this.name=name;
        this.balance=balance;
    }
    public void deposit(int amount)
    {
        balance += amount;
        System.out.println("Deposited amount = "+amount);
    }
    public void display()
    {
        System.out.println("Account number = "+acc_no);
        System.out.println("Name = "+name);
        System.out.println("Balance = "+balance);
    }
    abstract void interest();
}
class saving extends bank
{

    saving(int acc_no,String name,double balance) {
        super(acc_no,name,balance);

    }
    public void interest()
    {
        balance+=balance*0.04;
        System.out.println("Savings Account Balance = "+balance);
    }
    
}
class current extends bank
{

    current(int acc_no,String name,double balance) {
         super(acc_no,name,balance);

    }
    public void interest()
    {
        System.out.println("Current Account Balance = "+balance);
    }
    
}
class FD extends bank
{

    FD(int acc_no,String name,double balance) {
         super(acc_no,name,balance);

    }
    public void interest()
    {
        balance+=balance*0.07;
        System.out.println("FD Account Balance = "+balance);
    }
    
}
public class bank_app {
    public static void main(String[] args) {
        bank c = new saving(1, "Prince", 0);
        c.deposit(10000);
        c.interest();
        c.display();
        
        bank c1 = new current(1, "Prince", 0);
        c1.deposit(10000);
        c1.interest();
        c1.display();
        
        bank c2 = new FD(1, "Prince", 0);
        c2.deposit(10000);
        c2.interest();
        c2.display();
    }
}