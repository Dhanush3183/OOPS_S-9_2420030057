package Operators_Q;
import java.util.*;
public class Q5 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		
		System.out.println("Compound Assignment Operators : ");
		a+=b;
		System.out.println("+ : "+a);
		a-=b;
		System.out.println("- : "+a);
		a*=b;
		System.out.println("* : "+a);
		a/=b;
		System.out.println("/ : "+a);
	}
}
