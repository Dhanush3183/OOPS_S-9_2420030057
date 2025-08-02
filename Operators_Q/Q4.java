package Operators_Q;
import java.util.*;
public class Q4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		
		System.out.println(a+" AND "+b+" is "+(a&b));
		System.out.println(a+" OR "+b+" is "+(a|b));
		System.out.println(a+" XOR "+b+" is "+(a^b));
		System.out.println("Complement of "+a+" is "+(~a));
	}
}
