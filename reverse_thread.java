import java.util.Scanner;
public class reverse_thread extends Thread {
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int reverse=0;
        for(int i = 0;i<=2;i++)
        {
            int digit = x %10;
			reverse = reverse*10+digit;
			x = x/10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        reverse_thread r = new reverse_thread();
        r.start();
    }

}
