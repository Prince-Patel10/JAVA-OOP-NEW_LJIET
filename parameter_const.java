public class parameter_const
{
    int l1,b1;
    parameter_const(int l,int b) 
    {
        l1=l;
        b1=b;
    }
    public void area()
    {
        int area = l1*b1;
        System.out.println(area);
    }
    public static void main(String[] args)
    {
        parameter_const r = new parameter_const(4, 5);
        r.area();
    }
}