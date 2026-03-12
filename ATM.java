public class ATM extends Thread 
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+ " is withdrawing money");
    }
    public static void main(String[] args) {
        ATM u1 = new ATM();
        u1.start();

        ATM u2 = new ATM();
        u2.start();

        u1.setName("User 1");
        u2.setName("User 2");
    }
}
