package Codes;
import java.util.*;
public class Q5 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no.of sales persons : ");
		int n = sc.nextInt();
		
		int[][] a = new int[n][13];
		
		int i,j;
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the Data of Sales Person "+(i+1)+" : ");
			for(j=0;j<12;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		
		for(i=0;i<n;i++)
		{
			float sum=0;
			System.out.print("The Data of Sales Person "+(i+1)+" : ");
			for(j=0;j<12;j++)
			{
				sum+=a[i][j];
				
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println("");
			System.out.println("Sum : " + (int)sum);
			float avg = sum/12;
			
			System.out.println("Avg : " + avg);
			
			System.out.print("Performance : ");
			if(sum > 150)
			{
				System.out.println("Excellent");
			}
			else if(sum > 100)
			{
				System.out.println("Good");
			}
			else if(sum > 50)
			{
				System.out.println("Average");
			}
			else
			{
				System.out.println("Poor");
			}
			
			System.out.println("");
		}
	}
}