abstract class shape{
    abstract void area();
    abstract void perimeter();
}
class rectangle extends shape{
    double l,d;
    public rectangle(double l,double d) {
        this.l=l;
        this.d=d;
    }
    @Override
    void area()
    {
        double area = l *d;
        System.out.println("Area = "+area);
    }
    @Override
    void perimeter()
    {
        double perimeter = 2*(l+d);
        System.out.println("Area = "+perimeter);
    }
}
class circle extends shape
{
    double r;
    public circle(double r) {
        this.r=r;
    }
    void area()
    {
        double area = 3.14 * r *r;
        System.out.println("Area = "+area);
    }
    void perimeter()
    {
        double perimeter = 2*3.14*r;
        System.out.println("Area = "+perimeter);
    }
}
public class shapes {
    public static void main(String[] args) {
        shape r = new rectangle(4.0,5.0);
        shape c = new circle(6.0);

        r.area();
        r.perimeter();

        c.area();
        c.perimeter();
    }
}
