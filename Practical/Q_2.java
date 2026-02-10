import java.util.Scanner;
class Q_2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number");
        int n = sc.nextInt();

        int sum=0;

        // use while loop for checking number of digits
        for(int i = 1; i <=3 ; i++)
        {
            int digit = n %10;
            sum = sum + digit;
            n = n/10;
        }

        System.out.println("Sum = "+sum);
    }
}