import java.io.*;
class student
{
    int roll_no;
    String name;

    public student(int roll_no,String name) {
        this.roll_no=roll_no;
        this.name=name;
    }
    public String toString()
    {
        return "Roll_no " + roll_no + " Name " + name +"\n";
    }
}
public class Q12 {
    public static void main(String[] args) throws IOException {
        student s1 = new student(1, "Prince");
        student s2 = new student(2, "Vishw");

        FileOutputStream o = new FileOutputStream("student.txt");
        o.write(s1.toString().getBytes());
        o.write(s2.toString().getBytes());
        o.close();

        System.out.println("Entered");

        FileInputStream fis = new FileInputStream("student.txt");
        System.out.println("Student details read from file:");
        int i;
        while((i = fis.read()) != -1)
        {
          System.out.print((char)i);
        }
        fis.close();
      }
    }