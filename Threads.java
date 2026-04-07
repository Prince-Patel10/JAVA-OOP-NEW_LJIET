import java.util.*;
public class Threads extends Thread {
    public void run()
    {   
            // for(int i=1;i<=2;i++)
            // {
            System.out.println(Thread.currentThread().getName()+" is running");
            // }
    }
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        // Threads u1 = new Threads();
        // u1.start();
        // Threads u2 = new Threads();
        //u2.start();

        System.out.println("Enter number of threads you want");
        int n = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter thread name you want");
        String s = sc.next();

        for(int i =0; i<n ; i++)
        {
            Threads u3 = new Threads();
            u3.start();
            u3.setName(s);
        }
    }
}
