class parent
{
    public void show()
    {
        System.out.println("This is parent Class");
    }
}
class child1 extends parent
{
    public void show1()
    {
        System.out.println("This is Child1 Class");
    }
}
class INH_H_C2 extends parent {
    public void show2()
    {
        System.out.println("This is Child2 Class");
    }
    public static void main(String[] args) {
        child1 c1 = new child1();
        c1.show1();
        c1.show();
        INH_H_C2 c2 = new INH_H_C2();
        c2.show2();
        c2.show();
    }
}