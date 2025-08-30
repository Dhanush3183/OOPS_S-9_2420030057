package Code;
import java.util.*;

class employee{
	
	int id;
	String name;
	double sal;
	
	
	
	employee(int id,String name,double sal)
	{
		System.out.println("The employee " + this.name + " with ID : " + this.id + " has salary of Rs." + this.sal + "/-");
	}
	
}


public class Q4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		employee a = new employee(1,"Chethan",15000);
		a.id = 2;
		a.name = "Ram";
		a.sal = 25000;
		
		
		sc.close();
	}
}