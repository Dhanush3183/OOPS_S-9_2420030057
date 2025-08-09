//StringBuffer or StringBuilder Class Methods:
// 
// 1. append(String s)
// 2. insert(int offset, String s)
// 3. replace(int start, int end, String s)
// 4. delete(int start, int end)
// 5. deleteCharAt(int index)
// 6. reverse()
// 7. length()
// 8. capacity()
// 9. charAt(int index)
// 10. setCharAt(int index, char ch)
// 11. substring(int start)
// 12. substring(int start, int end)
// 13. toString()
// 14. ensureCapacity(int min)
// 15. setLength(int newLength)


package Codes;

public class Q4 {
	public static void main(String[] args)
	{
		StringBuffer a = new StringBuffer("Hello");
		
		System.out.println(a.append(" World"));
		
		System.out.println(a.insert(5," Java"));
		
		System.out.println(a.replace(6,10,"Robo"));
		
		System.out.println(a.delete(6,11));
		
		System.out.println(a.deleteCharAt(2));
		
		System.out.println(a.reverse());
		
		System.out.println(a.length());
		
		System.out.println(a.capacity());
		
		System.out.println(a.charAt(0));
		
		a.setCharAt(0, 'J');
		System.out.println(a);
		
		System.out.println(a.substring(3));
		
		System.out.println(a.substring(3, 6));
		
		a.toString();
		System.out.println(a);
		
		a.ensureCapacity(5);
		System.out.println(a);
		
		a.setLength(20);
		System.out.println(a.length());
		System.out.println(a);
		
	}
}
