import java.util.Scanner;
class array
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements you want in an array");
    int x = sc.nextInt();
    int [] a = new int[x];

    System.out.println("Enter array : ");
    for(int i=0;i<a.length;i++)
    {
        a[i] = sc.nextInt();
    }
    
    // for(int i=0;i<x;i++)
    // {
    //     System.out.print(" "+a[i]);
    // }
    // ENHANCED FOR LOOP
    for(int val:a){
        System.out.print(" "+val);
    }
}
}