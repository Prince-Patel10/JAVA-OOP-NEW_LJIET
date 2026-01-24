import java.util.*;
class grade
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int marks = sc.nextInt();
		
		int a=0;
		if(marks>=75 && marks<=100)
			a = 1;
		else if(marks>=65 && marks<=74)
			a = 2;
		else if(marks>=55 && marks<=64)
			a = 3;
		else if(marks>=45 && marks<=54)
			a = 4;
		else if(marks>=35 && marks<=44)
			a = 5;
		else if(marks<=35)
			a = 6;
		
		switch(a)
		{
			case 1:
				System.out.println("AA");
				break;
			case 2:
				System.out.println("AB");
				break;
			case 3:
				System.out.println("BB");
				break;
			case 4:
				System.out.println("BC");
				break;
			case 5:
				System.out.println("CC");
				break;
			case 6:
				System.out.println("FF");
				break;
			default:
				System.out.println("Invalid input");
		}
	}
}
		