package Codes;
import java.util.*;

public class Q5 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		String[] b = a.split(" ");
		
		String fn = b[0];
		
		String ln = b[b.length - 1];
		
		StringBuffer rev = new StringBuffer(ln);
		
		rev.reverse();
		
		System.out.println(fn + " " + rev);
		
		sc.close();
	}
}
