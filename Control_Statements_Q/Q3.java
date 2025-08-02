package Control_Statements_Q;
import java.util.*;
public class Q3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the marks : ");
		int a = sc.nextInt();
		
		if(a>90)
		{
			System.out.println("O Grade");
		}
		else if(a>80)
		{
			System.out.println("A+ Grade");
		}
		else if(a>70)
		{
			System.out.println("A Grade");
		}
		else if(a>60)
		{
			System.out.println("B Grade");
		}
		else if(a>50)
		{
			System.out.println("C Grade");
		}
		else if(a>40)
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.println("F Grade");
		}
	}
}
