// SINGLE LEVEL INHERITANCE
import java.util.*;
class grandparent {
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    public void add1()
    {
        System.out.println("Enter a");
        a = sc.nextInt();
        System.out.println("Enter b");
        b = sc.nextInt();
        c = a + b ;
        System.out.println("Answer = "+c);
    }
}
class parent extends grandparent
{
    Scanner sc = new Scanner(System.in);
    int d,e;
    public void add2()
    {
        System.out.println("Enter d");
        d = sc.nextInt();
        e = d + c;
        System.out.println("Answer of child is = "+e);
    }
    
}
class INH_MULTI_ADD extends parent
{
    Scanner sc = new Scanner(System.in);
    int f,g;
    public void add3()
    {
        System.out.println("Enter d");
        f = sc.nextInt();
        g = e + f;
        System.out.println("Answer of child is = "+g);
    }
    public static void main(String[] args) {
        INH_MULTI_ADD ob = new INH_MULTI_ADD();
        ob.add1();
        ob.add2();
        ob.add3();
    }
}
