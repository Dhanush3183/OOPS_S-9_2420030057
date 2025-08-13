package Codes;

public class Q2 {
	public static void main(String[] args)
	{
		String str1 = "Hello World"; 
		String str2 = "hello world"; 
	    String str3 = "Hello World";
	    
	    System.out.println(str1 == str2); // == operator check to the address in the heap. These are different strings.
	    System.out.println(str1 == str3); // These both point to the same address in the heap.
	    System.out.println(str1.equals(str2)); // equals() checks the value in the string. these both are different.
	    System.out.println(str1.equals(str3)); // These both are same.
	    System.out.println(str1.compareTo(str2)); // comapares the both strings in lexicographic manner. -ve represents str1 is smaller.
	    System.out.println(str2.compareTo(str3)); // +ve represents str2 in greater.
	}
} 