
//String Methods:
//
// 1. length()
// 2. charAt(int index)
// 3. substring(int beginIndex)
// 4. substring(int beginIndex, int endIndex)
// 5. equals(String anotherString)
// 6. equalsIgnoreCase(String anotherString)
// 7. compareTo(String anotherString)
// 8. compareToIgnoreCase(String anotherString)
// 9. contains(CharSequence s)
// 10. startsWith(String prefix)
// 11. endsWith(String suffix)
// 12. indexOf(String str)
// 13. lastIndexOf(String str)
// 14. trim()
// 15. replace(char oldChar, char newChar)
// 16. replaceAll(String regex, String replacement)
// 17. replaceFirst(String regex, String replacement)
// 18. toLowerCase()
// 19. toUpperCase()
// 20. toCharArray()
// 21. isEmpty()
// 22. valueOf(anyType)
 
 

package Project;

public class Q3 {
	public static void main(String args[])
	{
		String a = "Hello World!";
		
		System.out.println("String : "+a);
		System.out.println("Length : "+a.length());
		System.out.println("Character at 4 : "+a.charAt(4));
		System.out.println("Sub String : "+a.substring(3));
		System.out.println("Sub String : "+a.substring(3,6));
		System.out.println("Equals : "+a.equals("Hello World!"));
		System.out.println("Equals Ignore Case : "+a.equalsIgnoreCase("Hello World!"));
		System.out.println("Compare To : "+a.compareTo("Hello World!"));
		System.out.println("Compare To Ignore Case : "+a.compareToIgnoreCase("Hello World!"));
		System.out.println("Cointains llo : "+a.contains("llo"));
		System.out.println("Starts With H : "+a.startsWith("H"));
		System.out.println("Ends With ! : "+a.endsWith("!"));
		System.out.println("Index Of Wor : "+a.indexOf("Wor"));
		System.out.println("Last Index Of Wor : "+a.lastIndexOf("Wor"));
		System.out.println("Trimmed : "+a.trim());
		System.out.println("Replace ! with $ : "+a.replace("!", "$"));
		System.out.println("Replace World with Robo : "+a.replaceAll("l", "h"));
		System.out.println("Replace World with Robo : "+a.replaceFirst("l", "h"));
		System.out.println("LowerCase : "+a.toLowerCase());
		System.out.println("UpperCase : "+a.toUpperCase());
		char[] b = a.toCharArray();
		System.out.println(b);
		System.out.println("Is Empty : "+a.isEmpty());
		
		int i =10;
		String c = String.valueOf(i);
		System.out.println("Value Of int i : "+c);
		
	}
}
