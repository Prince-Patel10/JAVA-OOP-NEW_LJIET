import java.util.*;
class WRWA
{
    int display(int a,int b)
    {
        System.out.println("With return With arguement");
        return (a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WRWA ob = new WRWA();
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(ob.display(m,n));
    }
} 