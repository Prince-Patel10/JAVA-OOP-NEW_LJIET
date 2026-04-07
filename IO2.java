import java.io.*;
public class IO2 {
    public static void main(String[] args) throws IOException {
        PrintWriter p = new PrintWriter("C:\\Users\\princ\\OneDrive\\Desktop\\Java\\file.txt");
        String data = "Hiiii";
        p.print(data);
        int age =35;

        p.printf("I am %d years old",age);
        p.close();
    }
}
