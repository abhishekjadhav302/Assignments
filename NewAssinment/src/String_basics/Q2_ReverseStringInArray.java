package String_basics;

public class Q2_ReverseStringInArray {

	public static void main(String[] args) {

		String str = "Learning java with Abhi";
		String reverse = "";

		for (int a = str.length() - 1; a >= 1; a--) {

			reverse += str.charAt(a);
//			String[] usingSplit = str.split(" ");
		}
		System.out.println(reverse);

	}
}
