import java.util.Scanner;
public class bannk_credit extends Thread{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to credit");
        int amt = sc.nextInt();

        System.out.println(amt + " credited");
        int balance = 0;
        balance += amt;
        System.out.println(balance);
    }
    public static void main(String[] args) {
        bannk_credit b = new bannk_credit();
        b.start();
        bannk_credit b1 = new bannk_credit();
        b1.start();
        bannk_credit b2 = new bannk_credit();
        b2.start();
    }
}
