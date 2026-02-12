class parent
{
    void show1()
    {
        System.out.println("This is a parent class");
    }
}
class child_object_casting extends parent{
    void show2()
    {
        System.out.println("This is a child class");
    }
    public static void main(String[] args) {
        child_object_casting c = new child_object_casting();
        c.show2();

        parent p = new child_object_casting();
        p.show1();

        child_object_casting cc = (child_object_casting)p;
        cc.show1();
    }
}
