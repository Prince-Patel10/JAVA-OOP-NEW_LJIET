import java.util.Scanner;

class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number");
		int n = sc.nextInt();

		int sum=0;
		
		do
		{
			int digit = n %10;
			sum = sum + digit;
			n = n/10;
		}while(n>0);
        
		System.out.println("Sum = "+sum);
    }
    
}
