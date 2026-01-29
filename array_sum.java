import java.util.Scanner;
class array_sum
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    System.out.println("Enter number of elements you want in an array");
    int x = sc.nextInt();
    int [] a = new int[x];

    for(int i=0;i<a.length;i++)
    {
        a[i] = sc.nextInt();
    }
    System.out.println("Enter array : ");
    for(int i=0;i<x;i++)
    {
        sum+=a[i];
    }
    System.out.println("SUM OF ARRAY IS : "+sum);
}
}