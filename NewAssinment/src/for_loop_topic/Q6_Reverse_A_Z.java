package for_loop_topic;

public class Q6_Reverse_A_Z {

	public static void main(String[] args) {
		for(char i = 'Z'; i >= 'A'; i--) {
			System.out.println(i);
		}
		
		
		System.out.println("-------------While loop-----------------");
		
		char i = 'Z';
		while(i >= 'A') {
			
			System.out.println(i);
			
			i--;
		}
	}

}
