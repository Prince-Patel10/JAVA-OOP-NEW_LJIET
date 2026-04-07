public class Q8 {
    int balance,withdraw;

    public Q8(int balance) {
        this.balance=balance;
    }
    
    void withdraw(int withdraw) throws ArithmeticException
    {
       if(withdraw>balance)
       {
        throw new ArithmeticException("Insufficient balance");
       }
       balance -= withdraw;
        System.out.println("Withdrawal successful! New Balance: " + balance);
    }
    public static void main(String[] args) {
        Q8 o = new Q8(1000);
        o.withdraw(10000);
}
}