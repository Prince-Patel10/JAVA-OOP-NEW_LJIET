// SINGLE LEVEL INHERITANCE
class inheritance_parent {
    public void show1()
    {
        System.out.println("This is parent class");
    }
}
class inheritance_child extends inheritance_parent
{
    public void show2()
    {
        System.out.println("This is child class");
    }
    public static void main(String[] args) {
        inheritance_child ob = new inheritance_child();
        ob.show1();
        ob.show2();
    }
}