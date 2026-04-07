interface P 
{
    int i = 10;
    void p();
}
interface P1 extends P
{
    int i1 = 20;
    void p1();
}
interface P2 extends P
{
    int i2 = 30;
    void p2();
}
interface P12 extends P1,P2{
    int i12 = 40;
    void p12();
}
public class Q6 implements P12{
    public void p()
  {
    System.out.println("A="+i);
  }
  public void p1()
  {
    System.out.println("B="+i1);
  }
  public void p2()
  {
    System.out.println("C="+i2);
  }
  public void p12()
  {
    System.out.println("D="+i12);
  }
  
  public static void main(String[] args) {
      Q6 a=new Q6();
      a.p();
      a.p1();
      a.p2();
      a.p12();
  }
}
