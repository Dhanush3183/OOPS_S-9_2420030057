package Code;
import java.util.*;

class car
{
	String brand;
	float price;
	
	car()
	{
		System.out.println("Brand : Unknown");
		System.out.println("Price : Rs.0/-");
		System.out.println(" ");
	}
	
	car(String brand)
	{
		this.brand = brand;
		System.out.println("Brand : " + this.brand);
		System.out.println("Price : Rs.0/-");
		System.out.println(" ");
	}
	
	car(String brand, float price)
	{
		this.brand = brand;
		this.price = price;
		System.out.println("Brand : " + this.brand);
		System.out.println("Price : Rs." + this.price + "/-");
	}
}

public class Q5 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the brand of the Car : ");
		String brand = sc.next();
		
		System.out.print("Enter the price of the Car : ");
		float price = sc.nextFloat();
		
		System.out.println("");
		
		car a = new car();
		car b = new car(brand);
		car c = new car(brand,price);
		
		sc.close();
	}
}
