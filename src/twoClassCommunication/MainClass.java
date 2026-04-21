package twoClassCommunication;

public class MainClass {

	public static void main(String[] args) {
			
		ClassFirst mc = new ClassFirst();
		
		String str1 = mc.name = "abhi ";
		
		String str2 = mc.city =  "pune ";
		
		int pin = mc.pincode = 415010;
		
		System.out.println("Your details: " + str1 + str2 + pin);
		
		//========================================================
		
		ClassFirst mc1 = new ClassFirst();
		
		String str3 = mc1.name = "kunal ";
		
		String str4 = mc1.city =  "satara ";
		
		int pinc = mc1.pincode = 415500;
		
		System.out.println("Your details: " + str3 + str4 + pinc);
	}

}
