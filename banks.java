import java.util.*;
interface bank{
    void rate_of_interest();
}
class SBI implements bank
{
    double amt;
    public SBI(double amt) {
        this.amt=amt;
    }
    
    public void rate_of_interest() {
        double interest = amt * 0.07;
        System.out.println("total = "+interest);
    }
    
}
class Axis implements bank
{
    double amt;
    public Axis(double amt) {
        this.amt=amt;
    }
    
    public void rate_of_interest() {
        double interest = amt * 0.08;
        System.out.println("total = "+interest);
    }
    
}
public class banks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        double amount = sc.nextDouble();

        SBI s = new SBI(amount);
        s.rate_of_interest();
        Axis a = new Axis(amount);
        a.rate_of_interest();
    }
    
}
