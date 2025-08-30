package Code;
import java.util.*;

class student
{
	long rollno;
	String name;
	double marks;
	
	void display(long a,String b, double c)
	{
		System.out.println("");
		System.out.println(b + " having RollNo. " + a + " got " + c + " marks.");
		System.out.println("");
	}
}


public class Q1 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		student a = new student();
		
		System.out.println("Enter the rollno, name, marks of a : ");
		a.rollno = sc.nextLong();
		a.name = sc.next();
		a.marks = sc.nextDouble();
		a.display(a.rollno,a.name,a.marks);
		
		student b = new student();
		
		System.out.println("Enter the rollno, name, marks of b : ");
		b.rollno = sc.nextLong();
		b.name = sc.next();
		b.marks = sc.nextDouble();
		b.display(b.rollno,b.name,b.marks);
		
		student c = new student();
		
		System.out.println("Enter the rollno, name, marks of c : ");
		c.rollno = sc.nextLong();
		c.name = sc.next();
		c.marks = sc.nextDouble();
		c.display(c.rollno,c.name,c.marks);
		
		sc.close();
	}
}