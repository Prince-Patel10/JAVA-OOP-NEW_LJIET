import java.io.*;
class IO
{
    public static void main(String[] args) throws IOException
    {
        FileWriter f = new FileWriter("C:\\Users\\princ\\OneDrive\\Desktop\\Java\\file.txt");
        f.write("Hello world");
        f.close();
        System.out.println("Succesful");
    }
}