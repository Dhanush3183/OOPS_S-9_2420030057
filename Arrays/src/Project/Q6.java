package Project;
import java.util.*;
public class Q6 {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of N : ");
		int n = sc.nextInt();
		
		int [] a = new int[n];
		
		int min=1000000;
		int max=0;
		
		System.out.print("Enter the numbers : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			if(a[i]<min)
			{
				min=a[i];
			}
			
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Min : "+min);
		System.out.println("Max : "+max);
		
		sc.close();
	}
}