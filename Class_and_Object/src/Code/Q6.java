package Code;
import java.util.*;

class box
{
	int length = 1;
	int width = 1;
	int height = 1;
	
	box()
	{
		int vol = this.length * this.width * this.height;
		
		System.out.println("Volume : " + vol + " cm^3");
		System.out.println(" ");
	}
	
	box(int length, int width)
	{
		this.length = length;
		this.width = width;
		
        int vol = this.length * this.width * this.height;
		
		System.out.println("Volume : " + vol + " cm^3");
		System.out.println(" ");
	}
	
	box(int length, int width, int height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
		
        int vol = this.length * this.width * this.height;
		
		System.out.println("Volume : " + vol + " cm^3");
		System.out.println(" ");
	}
}

public class Q6 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Length (in cm) : ");
		int length = sc.nextInt();
		
		System.out.print("Enter the Width (in cm) : ");
		int width = sc.nextInt();
		
		System.out.print("Enter the Height (in cm) : ");
		int height = sc.nextInt();
		
		System.out.println("");
		
		box a = new box();
		box b = new box(length,width);
		box c = new box(length,width,height);
		
		sc.close();
	}
}
