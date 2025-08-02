package Operators_Q;
import java.util.*;
public class Q7 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		
		int ch = (a>b)? a : b;
		
		System.out.println("Greatest is "+ch);
	}
}
