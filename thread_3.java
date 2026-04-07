class error extends Thread{
    public void run()
    {
        System.out.println("Errorrrrrrrrrr");
    }
}
class suggestion extends Thread{
    public void run()
    {
        System.out.println("Suggestionnn");
    }
}
class autosaving extends Thread{
    public void run()
    {
        System.out.println("Autosavingggg");
    }
}
class buzing extends Thread{
    public void run()
    {
        System.out.println("buzing");
    }
}
class thread_3 extends Thread{
    public static void main(String[] args) {
        error r = new error();
        suggestion s = new suggestion();
        autosaving a = new autosaving();
        buzing b = new buzing();
        r.start();
        s.start();
        a.start();
        b.start();
    }
}