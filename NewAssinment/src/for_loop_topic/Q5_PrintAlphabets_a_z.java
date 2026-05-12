package for_loop_topic;

public class Q5_PrintAlphabets_a_z {

	public static void main(String[] args) {
		System.out.println("--------------------Below for loop method---------------------------");

/*
		for(int i = 97; i <= 122; i++) {
			char letters = (char) i;
			System.out.println(letters);
		}
*/	
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
			
			int num = i;
			System.out.println(num);
		}
		
		
		System.out.println("\n--------------------Below While loop method---------------------------");
		
/*		
		int i = 97;
		while(i <= 122) {
			char letters = (char) i;
			System.out.println(letters);
			
			i++;
		}
*/		
		char ch = 'a';
		while(ch <= 'z') {
			System.out.println(ch);
			
			ch++;
		}
		
	}

}