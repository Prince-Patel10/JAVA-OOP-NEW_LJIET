public class movie_ticket extends Thread {
    public void run()
    {
        for(int i = 1;i<6;i++)
        {
            System.out.println(Thread.currentThread().getName() +" Booking ticket "+i);
        }
    }
    public static void main(String[] args)
    {
        movie_ticket m1 = new movie_ticket();
        m1.start();
        movie_ticket m2 = new movie_ticket();
        m2.start();

        m1.setName("User 1");
        m2.setName("User 2");
    }
}
