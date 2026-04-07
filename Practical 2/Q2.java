abstract class shapes
{
    abstract void area();
}
class triangle extends shapes
{
    double l,b;

    public triangle(double l,double d) {
        this.l = l;
        this.b = b;
    }
    void area()
    {
        double area = 0.5 * l * b;
        System.out.println("Area = "+area);
    }
}
class circle extends shapes
{
    double r;
    public circle(double r) {
        this.r=r;
    }
    void area()
    {
        double area = 3.14 * r * r;
        System.out.println("Area = "+area);
    }
}
class square extends shapes
{
    double l;
    public square(double l) {
        this.l = l;
    }

    void area()
    {
        double area = l*l;
        System.out.println("Area = "+area);
    }
}
public class Q2{
    public static void main(String[] args) {
        shapes o= new triangle(3, 4);
        shapes o1= new circle(4);
        shapes o2= new square(5);

        o.area();
        o1.area();
        o2.area();
    }
}