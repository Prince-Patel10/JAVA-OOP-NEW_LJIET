import java.util.*;
class rectangle_cons {
    int l,b;
    Scanner sc = new Scanner(System.in);
    rectangle_cons()
    {
        System.out.println("Enter length");
        l = sc.nextInt();
        System.out.println("Enter breadth");
        b = sc.nextInt();
    }
    public void area()
    {
        int area = l * b;
        System.out.println(area);
    }
    public static void main(String[] args) {
        rectangle_cons r = new rectangle_cons();
        r.area();
    }
}
