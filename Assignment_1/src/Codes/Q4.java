package Codes;
import java.util.*;
public class Q4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		if(n<100 && n%2!=0 && n%5!=0)
		{
			int c=0;
			
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;
				}
			}
			
			if(c==2)
			{
				System.out.println("TRUE");
			}
			else
			{
				System.out.println("FALSE");
			}
		}
		else
		{
			System.out.println("FALSE");
		}
		
		
		
		sc.close();
	}
}
