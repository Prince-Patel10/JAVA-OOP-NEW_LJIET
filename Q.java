interface P {
    public static final int a =10;
    void a1();
}
interface P1 extends P {
    public static final int b =20;
    void b1();
}
interface P2 extends P{
    public static final int c =30;
    void c1();
}
interface P12 extends P1,P2{
    public static final int d =40;
    void d1();
}
class Q implements P12{
    public void a1()
    {
        System.out.println("a1 iss calling "+a);
    }
    public void b1()
    {
        System.out.println("b1 iss calling "+b);
    }
    public void c1()
    {
        System.out.println("c1 iss calling "+c);
    }
    public void d1()
    {
        System.out.println("d1 iss calling "+d);
    }
    public static void main(String[] args) {
        Q q = new Q();
        q.a1();
        q.b1();
        q.c1();
        q.d1();
    }
}
