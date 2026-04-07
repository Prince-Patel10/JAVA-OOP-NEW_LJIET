public class Thread_priority extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" Priority "+ Thread.currentThread().getPriority());
    }
    public static void main(String[] args)
    {
        Thread_priority t1 = new Thread_priority();
        Thread_priority t2 = new Thread_priority();
        Thread_priority t3 = new Thread_priority();

        t1.start();
        t2.start();
        t3.start();

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t3.setPriority(NORM_PRIORITY);

    }
}
