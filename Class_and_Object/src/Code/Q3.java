package Code;
import java.util.*;

class book{
	
	book(String a,String b,double c)
	{
		System.out.println("The book '" + a + "' is written by " + b + ", it costs Rs." + c + "/-");
	}
	
}


public class Q3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		book a = new book("Warriors","Chethan",125);
		
		sc.close();
	}
}