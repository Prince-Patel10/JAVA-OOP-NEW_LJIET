public class Ticket_booking extends Thread{
    public void run()
    {
        for(int i = 1;i<=5;i++)
        {
        System.out.println(Thread.currentThread().getName()+ " has booked ticket "+i);
        }
    }
    public static void main(String[] args) {
        Ticket_booking t1 = new Ticket_booking();
        t1.start();
        Ticket_booking t2 = new Ticket_booking();
        t2.start();

        t1.setName("User 1");
        t2.setName("User 2");
    }
}
