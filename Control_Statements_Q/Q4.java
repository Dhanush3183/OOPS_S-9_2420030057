package Control_Statements_Q;
import java.util.*;
public class Q4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Day Number : ");
		int a = sc.nextInt();
		
		if(a==1)
		{
			System.out.println("Sunday");
		}
		else if(a==2)
		{
			System.out.println("Monday");
		}
		else if(a==3)
		{
			System.out.println("Tuesday");
		}
		else if(a==4)
		{
			System.out.println("Wednesday");
		}
		else if(a==5)
		{
			System.out.println("Thursday");
		}
		else if(a==6)
		{
			System.out.println("Friday");
		}
		else if(a==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Entered number wrong");
		}
	}
}
