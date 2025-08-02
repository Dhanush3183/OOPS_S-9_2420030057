package Control_Statements_Q;
import java.util.*;
public class Q2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
