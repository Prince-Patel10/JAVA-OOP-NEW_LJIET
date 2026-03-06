abstract class house{
    abstract void paint(String paint);
    abstract void design(String design);
    abstract void furniture(String furniture);
}
class room extends house{
    public void paint(String paint)
    {
        System.out.println("Colour = "+paint);
    }
    public void design(String design)
    {
        System.out.println("Design = "+design);
    }
    public void furniture(String furniture)
    {
        System.out.println("Furniture = "+furniture);
    }
}
class kitchen extends house{
    public void paint(String paint)
    {
        System.out.println("Colour = "+paint);
    }
    public void design(String design)
    {
        System.out.println("Design = "+design);
    }
    public void furniture(String furniture)
    {
        System.out.println("Furniture = "+furniture);
    }
}
class bathroom extends house{
    public void paint(String paint)
    {
        System.out.println("Colour = "+paint);
    }
    public void design(String design)
    {
        System.out.println("Design = "+design);
    }
    public void furniture(String furniture)
    {
        System.out.println("Furniture = "+furniture);
    }
}
public class house_final {
    public static void main(String[] args) {
        house r = new room();
        r.paint("Yellow");
        r.design("Modern");
        r.furniture("Korean");
        house r1 = new kitchen();
        r.paint("Yellow");
        r.design("Modern");
        r.furniture("Korean");
        house r3 = new bathroom();
        r.paint("Yellow");
        r.design("Modern");
        r.furniture("Korean");
    }
}
