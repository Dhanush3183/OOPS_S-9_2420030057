package Operators_Q;
import java.util.*;
public class Q3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the marks of Theory : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the marks of Practical : ");
		int b = sc.nextInt();
		
		if(a>=40 && b>=40)
		{
			System.out.println("Student Passed");
		}
		else
		{
			System.out.println("Student Failed");
		}
	}
}
