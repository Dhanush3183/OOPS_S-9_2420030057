package Codes;

public class Q2 {
	public static void main(String[] args)
	{
		String a = "Hello";
		
		String b = "Hello";
		
		String c = new String("Hello");
		
		System.out.println("a == b : " + (a==b));
		System.out.println("a equals b : " + a.equals(b));
		System.out.println("a == c : " + (a==c));
		System.out.println("a equals c : " + a.equals(c));
				
	}
}


//== operator checks only the object same or not. As a and b are of same object, so it returns true.
//While a and c are of different objects as we used new operator. so it returns false.
//equals() operator checks the string value.