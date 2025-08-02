package Project;
import java.util.*;
public class Q3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String a = sc.nextLine();
		
		System.out.println("String : "+a);
		System.out.println("Length : "+a.length());
		System.out.println("UpperCase : "+a.toUpperCase());
		System.out.println("LowerCase : "+a.toLowerCase());
		System.out.println("Character at 4 : "+a.charAt(4));
		System.out.println("Sub String : "+a.substring(3,6));
		System.out.println("Cointains llo : "+a.contains("llo"));
		System.out.println("Replace World with Robo : "+a.replace("world", "robo"));
		System.out.println("Trimmed : "+a.trim());
		a=a.trim();
		System.out.println("Length after trimmed : "+a.length());
		sc.close();
	}
}