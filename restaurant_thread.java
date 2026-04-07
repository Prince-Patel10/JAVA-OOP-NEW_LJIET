class order extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is taking order");
    }
}

class booking extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is booking order");
    }
}
class delivering extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is delivering order");
    }
}
class restaurant_thread {
    public static void main(String[] args) {
        order o1=new order();
        booking b1=new booking();
        delivering d1=new delivering();
        o1.start();
        b1.start();
        d1.start();
    }
}