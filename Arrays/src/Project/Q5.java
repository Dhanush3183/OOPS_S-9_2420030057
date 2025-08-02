package Project;
import java.util.*;
public class Q5 {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of N : ");
		int n = sc.nextInt();
		
		int [] a = new int[n];
		int [] b = new int[n];
		
		int k=0;
		int c=0;
		
		System.out.print("Enter the numbers : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<n;i++)
		{
			c=0;
			for(int j=0;j<k;j++)
			{
				if(a[i]==b[j])
				{
					c=1;
					break;
				}
			}
			
			if(c==0)
			{
				b[k]=a[i];
				k++;
			}
		}
		
		System.out.print("Duplicates Removed : ");
		for(int i=0;i<k;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		sc.close();
	}
}