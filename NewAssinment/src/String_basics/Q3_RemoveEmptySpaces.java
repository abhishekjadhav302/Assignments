package String_basics;

public class Q3_RemoveEmptySpaces {
	public static void main(String[] args) {
		String str1 = " Trending Java ";
		
		// 1. trim(), strip(), stripIndent() are same
		// 1.1 - stripTrailing() remove white spaces of ending of the string
		// 1.2 - stripLeading() remove white spaces of starting of the string
		// 2. replace()
		// 3. replaceAll()
		
		System.out.println(str1.trim());
		System.out.println(str1.strip());
		System.out.println(str1.stripIndent());
		System.out.println(str1.stripTrailing());
		System.out.println(str1.stripLeading());
		System.out.println(str1.replace(" ", ""));
		System.out.println(str1.replaceAll(" ", ""));
	}

}
