package Operators_Q;
import java.util.*;
public class Q8 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		
		System.out.println("Shift Operators : ");
		int b = a<<2;
		System.out.println("<< : "+b);
		int c = a>>2;
		System.out.println(">> : "+c);
	}
}
