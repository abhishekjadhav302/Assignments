package String_basics;

public class Q4_RemoveEmptySpace_for_loop {
	public static void main(String[] args) {
		String str1 = " Java Programming ";
		
		str1 = str1.format("javaprogramming", str1);
		System.out.println("String manipulation: " + str1);
	
/*
		//using append()
		String collectApp = "";
		for(int i = 0; i < str1.length(); i++) {
			char r = str1.charAt(i);
			if(r != ' ') {
				collectApp += r;
			}
		}
		System.out.println("Using append(): ");
		System.out.println(collectApp);
*/

///*
		// using charAt() method
		
		String collectChar = "";
		for(int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if(ch != ' ') {
				collectChar += ch;
			}
		}
				System.out.println("using charAt(): ");
				System.out.println(collectChar);
//*/		
	}
}
