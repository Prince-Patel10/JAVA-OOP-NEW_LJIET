import java.util.Scanner;
class array_sum_2d
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows you want in an array");
    int r = sc.nextInt();
    System.out.println("Enter number of columns you want in an array");
    int c = sc.nextInt();
    int [][] a = new int[r][c];
    int sum = 0;

    System.out.println("Enter array : ");
     for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
    //ELEMENT SUM
    for(int i=0;i<r;i++)
    {
         for(int j=0;j<c;j++)
        {
            sum+=a[i][j];
        }
    }
    System.out.println("SUM of element = "+sum);

    //SUM OF TWO ARRAY
    // int[][] add = new int[r][c];
    // System.out.println("ADDITON");
    // for(int i=0;i<r;i++)
    // {
    //      for(int j=0;j<c;j++)
    //     {
    //         add[i][j] = a[i][j] + a[i][j];
    //     }
    // }
    // for(int i=0;i<r;i++)
    // {
    //      for(int j=0;j<c;j++)
    //     {
    //         System.out.print(" "+add[i][j]);
    //     }
    //     System.out.println(" ");
    // }

    // //SUBTRACTION OF TWO ARRA
    // int[][] sub = new int[r][c];
    // System.out.println("SUBTRACTION");
    // for(int i=0;i<r;i++)
    // {
    //      for(int j=0;j<c;j++)
    //     {
    //         sub[i][j] = a[i][j] - a[i][j];
    //     }
    // }
    // for(int i=0;i<r;i++)
    // {
    //      for(int j=0;j<c;j++)
    //     {
    //         System.out.print(" "+sub[i][j]);
    //     }
    //     System.out.println(" ");
    // }

    //MULTIPLICATION OF TWO ARRAY
    int[][] mul = new int[r][c];
    int s = 0 ;
    for(int i=0;i<r;i++)
    {
         for(int j=0;j<c;j++)
        {
            for(int k=0;k<c;k++)
            {
            s+=a[i][k]*a[k][j];
            }
            mul[i][j] = s;
            s = 0;
        }
    }
    for(int i=0;i<r;i++)
    {
         for(int j=0;j<c;j++)
        {
            System.out.print(" "+mul[i][j]);
        }
        System.out.println(" ");
    }
}
}