package Project;
import java.util.*;
public class Q3 {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] a = new int[n];
		
		int sum=0;
		
		System.out.print("Enter the marks : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		
		System.out.print("Student marks : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		
		System.out.println("Sum of marks : "+sum);
		
		System.out.println("Average of marks : "+ (sum/n));
		
		sc.close();
	}
}