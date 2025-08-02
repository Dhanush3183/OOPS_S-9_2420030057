package Control_Statements_Q;
import java.util.*;
public class Q6 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("Enter the value of a : ");
		a = sc.nextInt();
		
		while(a!=0)
		{
			System.out.print("Enter the value of a : ");
			a = sc.nextInt();
		}
		
		System.out.print("Loop Exit");
	}
}