class method
{
    String brand;
    String colour;
    static int wheel =4;

    void display()
    {
        
        System.out.println("Vehicle is of this brand = "  + brand);
        System.out.println("Vehicle colour is =  "+colour );
    }
    static void display1()
    {
        System.out.println("Vehicle is "+wheel+" wheeler" );
    }
    public static void main(String[] args) 
    {
        method ob = new method();
        ob.brand="TATA";
        ob.colour="PRISTINE WHITE";
        ob.display();
        display1();
    }
}