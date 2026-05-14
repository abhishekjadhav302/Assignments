package String_basics;

public class Q5_Palindrome_Or_Not {
	public static void main(String[] args) {
		String palindrome = "iri";
		String check_i = "";
		String check_j = "";

		for (int i = 0; i < palindrome.length(); i++) {
			check_i = check_i + palindrome.charAt(i);
		}
		for (int j = palindrome.length() - 1; j >= 0; j--) {
			check_j = check_j + palindrome.charAt(j);
		}
		if (check_i.equals(check_j)) {
			System.out.println("This " + palindrome + " is palindrome");
		} else {
			System.err.println("This " + palindrome + " is not palindrome");
		}
	}
}
