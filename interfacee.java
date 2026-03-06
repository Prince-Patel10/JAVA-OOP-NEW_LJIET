interface R
{
    void on();
    void off();
}
public class interfacee implements R {
    public void on()
    {
        System.out.println("AC ON");
    }
    public void off()
    {
        System.out.println("AC OFF");
    }
    public static void main(String[] args) {
        interfacee s = new interfacee();
        s.on();
        s.off();
    }
}
