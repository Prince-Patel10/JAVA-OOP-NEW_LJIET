abstract class animal{
    abstract void sound();
}
class dog extends animal{
    void sound()
    {
        System.out.println("BHAUUU BHAUUUUUU");
    }
}
class cat extends animal{
    void sound()
    {
        System.out.println("MEOWW MEOWWWWW");
    }
}
class cow extends animal{
    void sound()
    {
        System.out.println("MOOOOOO MOOOOOOOO");
    }
}
public class animals {
    public static void main(String[] args) {
        animal d = new dog();
        animal ca = new cat();
        animal co = new cow();

        d.sound();
        ca.sound();
        co.sound();
    }
    
}
