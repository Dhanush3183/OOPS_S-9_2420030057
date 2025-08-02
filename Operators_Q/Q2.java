package Operators_Q;
import java.util.*;
public class Q2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else if(b>a)
		{
			System.out.println(b+" is greater than "+a);
		}
		else
		{
			System.out.println("Both "+a+" and "+b+" are equal");
		}
	}
}
