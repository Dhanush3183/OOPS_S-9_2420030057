package Project;
import java.util.*;
public class Q2 {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] a = new int[n];
		
		System.out.print("Enter the numbers : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		sc.close();
	}
}
