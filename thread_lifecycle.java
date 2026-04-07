public class thread_lifecycle extends Thread{
    public static void main(String[] args) {
        thread_lifecycle t = new thread_lifecycle();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());   
    }
}
