// SINGLE LEVEL INHERITANCE
import java.util.*;
class INH_add_parent {
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
class INH_add_child extends INH_add_parent
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
    public static void main(String[] args) {
        INH_add_child ob = new INH_add_child();
        ob.add1();
        ob.add2();
    }
}
