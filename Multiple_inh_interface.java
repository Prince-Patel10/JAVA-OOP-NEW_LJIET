//MULTIPLE INHERITANCE USING INTERFACE
interface print
{
    void printing();
}
interface copy
{
    void copying();
}
interface scan
{
    void scanning();
}
public class Multiple_inh_interface implements print,copy,scan {
    public void printing()
    {
        System.out.println("Printer can print");
    }
    public void copying()
    {
        System.out.println("Printer can copy");
    }
    public void scanning()
    {
        System.out.println("Printer can scan");
    }
    public static void main(String[] args) {
        Multiple_inh_interface m = new Multiple_inh_interface();
        m.printing();
        m.copying();
        m.scanning();
    }
}
