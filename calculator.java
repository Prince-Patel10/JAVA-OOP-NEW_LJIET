import java.util.*;
class calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int x = sc.nextInt();
		
		System.out.println("Enter number");
		int y = sc.nextInt();
		
		System.out.println("+, -, *, %, /");
		char choice = sc.next().charAt(0);
		
		switch(choice)
		{
			case '+' -> System.out.println(x+y);
			case '-' -> System.out.println(x-y);
			case '*' -> System.out.println(x*y);
			case '%' -> System.out.println(x%y);
			case '/' -> System.out.println(x/y);
			default -> System.out.println("Invalid input");
		}
	}
}