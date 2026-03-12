class A extends Thread
{
    public void run()
    {
        for (int i = 0; i <=1000;i++)
        {
            System.out.println("hi");
        }
    }
}
public class Multithread extends Thread{
    public void run()
    {
        for (int i = 0; i <=1001;i++)
        {
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        A a = new A();
        a.start();

        Multithread m = new Multithread();
        m.start();
    }
}
