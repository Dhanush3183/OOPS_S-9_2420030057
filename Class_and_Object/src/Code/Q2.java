package Code;
import java.util.*;

class rectangle{
	
	int length;
	int bredth;
	
	int perimeter(int l,int b)
	{
		return 2*(l+b);
	}
	
	int area(int l,int b)
	{
		return l*b;
	}
}


public class Q2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		rectangle a = new rectangle();
		
		int peri,area;
		
		System.out.print("Enter length : ");
		a.length = sc.nextInt();
		System.out.print("Enter bredth : ");
		a.bredth = sc.nextInt();
		
		peri = a.perimeter(a.length, a.bredth);
		area = a.area(a.length, a.bredth);
		
		System.out.println("");
		System.out.println("Perimeter : " + peri);
		System.out.println("Area : " + area);
		sc.close();
	}
}