package Project;
import java.util.*;
public class Q4 {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of N : ");
		int n = sc.nextInt();
		
		int [] a = new int[n];
		
		int f=0;
		int p=0;
		
		System.out.print("Enter the numbers : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter the target Element : ");
		int t = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==t)
			{
				f=1;
				p=i;
				break;
			}
		}
		
		if(f==0)
		{
			System.out.println("Element Not Found");
		}
		else
		{
			System.out.println("Element Found at position "+(p+1));
		}
		
		sc.close();
	}
}