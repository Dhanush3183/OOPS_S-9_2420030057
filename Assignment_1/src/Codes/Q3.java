package Codes;
import java.util.*;
public class Q3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter temperature : ");
		String a = sc.next();
		
		float b = Float.valueOf(a);
		
		double c = Double.valueOf(a);
		
		int d = (int)b;
		
		System.out.println("Float : " + b);
		System.out.println("Double : " + c);
		System.out.println("int : " + d);
		
		sc.close();
	}
}