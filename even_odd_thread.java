public class even_odd_thread extends Thread{
    public void run()
    {
        for(int i = 1;i<=10;i++)
        {
            if(i%2==0)
                System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public void run1()
    {
        for(int i = 1;i<=10;i++)
        {
            if(i%2!=0)
                 System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        even_odd_thread t = new even_odd_thread();
        t.setName("Even");
        t.run();

        even_odd_thread t2 = new even_odd_thread();
        t2.setName("Odd");
        t2.run1();
        
    }
}
