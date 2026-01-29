import java.util.Scanner;
class pattern2
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to print pattern");
    int x = sc.nextInt();

    for(int i=1;i<=x;i++)
    {
        for(int j=1;j<=x;j++)
        {
            System.out.print(j);
        }
        System.out.println(" ");
    }
}
}