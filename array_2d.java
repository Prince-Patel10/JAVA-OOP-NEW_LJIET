import java.util.Scanner;
class array_2d
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows you want in an array");
    int r = sc.nextInt();
    System.out.println("Enter number of columns you want in an array");
    int c = sc.nextInt();
    int [][] a = new int[r][c];

    System.out.println("Enter array : ");
     for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
    
    for(int i=0;i<r;i++)
    {
         for(int j=0;j<c;j++)
        {
            System.out.print(" "+a[i][j]);
        }
        System.out.println(" ");
    }
}
}