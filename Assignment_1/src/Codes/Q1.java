package Codes;
import java.util.*;
import java.time.*;
public class Q1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Start time (HH:MM) : ");
		String a = sc.next();
		
		System.out.print("Enter End time (HH:MM) : ");
		String b = sc.next();
		
		int sth = Integer.valueOf(a.substring(0, 2));
		int stm = Integer.valueOf(a.substring(3, 5));
		int edh = Integer.valueOf(b.substring(0, 2));
		int edm = Integer.valueOf(b.substring(3, 5));
		
		LocalTime st = LocalTime.of(sth,stm);
		LocalTime ed = LocalTime.of(edh,edm);
		
		Duration d;
		
		if(ed.isBefore(st)) 
		{
			d = Duration.between(st, ed.plusHours(24));
		}
		else
		{
			d = Duration.between(st, ed);
		}
		
		
		System.out.println("Duration Worked : " + d);
		
		sc.close();
	}
}
	