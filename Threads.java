public class Threads extends Thread {
    public void run()
    {   
            for(int i=1;i<=2;i++)
            {
            System.out.println(Thread.currentThread().getName()+" is running");
            }
    }
    public static void main(String[] args)
     {
        // Threads u1 = new Threads();
        // u1.start();
        // Threads u2 = new Threads();
        //u2.start();

        
        
        for(int i =0; i<2 ; i++)
        {
            Threads u3 = new Threads();
            u3.start();
        }
    }
}
