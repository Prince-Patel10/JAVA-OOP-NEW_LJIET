class Q1
{
    int acc_no;
    String name;
    int balance;

    void setdata(int acc_no, String name, int balance)
    {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }

    void display()
    {
        System.out.println("Account number = "+acc_no);
        System.out.println("Name = "+name);
        System.out.println("Balance = "+balance);
    }
    void deposit(int amount)
    {
        balance += amount;
        System.out.println("New Balance = "+balance);
    }
    public static void main(String[] args) {
        Q1 ob = new Q1();
        ob.setdata(1, "Prince", 30000);
        ob.display();
        ob.deposit(4000);
    }
}