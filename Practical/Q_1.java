import java.util.Scanner;
class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number");
		int n = sc.nextInt();
		
		int temp = n;
		int reverse=0;
		
		while(n>0)
		{
			int digit = n %10;
			reverse = reverse*10+digit;
			n = n/10;
		}
		System.out.println("Reverse \n"+reverse);
		if(reverse==temp)
			System.out.println("It is palindrome");
		else
			System.out.println("Not a palindrome");
    }
}
