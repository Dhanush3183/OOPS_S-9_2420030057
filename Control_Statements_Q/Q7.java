package Control_Statements_Q;
import java.util.*;
public class Q7 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}	