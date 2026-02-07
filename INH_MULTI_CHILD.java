class grandparent
{
    public void show1()
    {
        System.out.println("This is grand parent class");
    }
}
class parent extends grandparent{
    public void show2()
    {
        System.out.println("This is grand parent class");
    }
}
class INH_MULTI_CHILD extends parent {
    public void show3()
    {
        System.out.println("This is child class");
    }
    public static void main(String[] args) {
        INH_MULTI_CHILD ob = new INH_MULTI_CHILD();
        ob.show1();
        ob.show2();
        ob.show3();
    }
}
