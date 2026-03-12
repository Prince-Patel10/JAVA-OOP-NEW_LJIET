interface payment
{
    void paid();
}
class credit_card implements payment
{
    int amount;
    public credit_card(int amount) {
        this.amount = amount;
    }
    
    public void paid() {
        System.out.println(amount + " Paid by credit card");
    }
    
}
class UPI implements payment
{
   int amount;
    public UPI(int amount) {
        this.amount = amount;
    }
    public void paid() {
        System.out.println(amount + " Paid by UPI");
    }
    
}
public class pay {
    public static void main(String[] args) {
        credit_card c  = new credit_card(1000);
        c.paid();

        UPI u = new UPI(50000);
        u.paid();
    }
}