package for_loop_topic;

public class Q10_OddNum_without_if {
	public static void main(String arg[]) {

		for (int i = 1; i <= 100; i++) {

			while (i % 2 != 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
