interface Runnable //This is default interface which is in Thread class
{
    void run();
}
public class Thread_interface extends Thread {
    public void run()
    {
        for(int i = 0; i <2;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Thread_interface d = new Thread_interface();
        Thread t1 = new Thread(d);
        //Thread t2 = new Thread(d);

        t1.start();
        //t2.start();
    }
}
