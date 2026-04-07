public class printnumber_thread extends Thread{
    public void run()
    {
        for(int i = 1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printnumber_thread t = new printnumber_thread();
        t.start();
    }
}
