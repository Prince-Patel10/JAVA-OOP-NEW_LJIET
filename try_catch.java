import java.io.FileInputStream;
class try_catch {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("D:|HVS|ABC.txt");
        } 
        catch (Exception e) {
            System.out.println("HELLOOOOOO");
            System.out.println(e);
        }
    }
}
