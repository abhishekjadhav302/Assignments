package String_basics;

public class Q1_String_to_array {

	public static void main(String[] args) {
		String str = "Learning java with Abhishek";

		char[] ch = str.toCharArray();

		for (char c : ch) {
			System.out.println(c);
		}

		System.err.println("========= using splite method ======== ");

		String[] splitCheck = str.split(" ");

		for (String store : splitCheck) {
			System.out.println(store);
		}
	}

}
