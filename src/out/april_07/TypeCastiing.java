package out.april_07;

public class TypeCastiing {

	public static void main(String[] args) {

		// implicit type casting
		
		// 1. byte to integer
		byte num1 = 127;
		int num2 = num1;
		
		System.out.println("byte to inte implicit typecasting: " + num2);
		
		// 2. byte to short
		
		byte a = 23;
		short b = a;
		System.out.println("byte to short: " + b);
		
		// 3. int to short
		
		int x = 3432;
		short y = (short)x;
		System.out.println("int to short: "  + y);
		
		// float to long
		float m = 34.3434f;
		long n = (long)m;
		System.out.print("float to long: " + n);
		
		// long to double
		long h = 333333333;
		double t = h;
		System.out.println("long to double" + t);
	}
}
