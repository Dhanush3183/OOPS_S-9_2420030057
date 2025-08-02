package Operators_Q;
import java.util.*;
public class Q1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		
		System.out.println("Addition Of "+a+" and "+b+" is "+(a+b));
		System.out.println("Subtraction Of "+a+" and "+b+" is "+(a-b));
		System.out.println("Multiplication Of "+a+" and "+b+" is "+(a*b));
		System.out.println("Division Of "+a+" and "+b+" is "+(a/b));
		System.out.println("Modulus Of "+a+" and "+b+" is "+(a%b));
	}
}
