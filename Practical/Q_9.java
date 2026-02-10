class Q_9 {
    int acc_no=0;
    String name="";
    double balance=0.0;
    
    void setdata(int acc_no, String name, double balance)
    {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }
    void display()
    {
        System.out.println("ACCOUNT NUMBER = "+acc_no);
        System.out.println("NAME = "+name);
        System.out.println("BALANCE = "+balance);
    }
    void deposit(int amount)
    {
        balance = balance + amount;
        System.out.println("\nDeposited "+amount);
    }
    public static void main(String[] args) {
        Q_9 ob = new Q_9();
        ob.setdata(123, "Prince" , 10000.90);
        ob.display();
        ob.deposit(10000);
        ob.display();
    }
}
