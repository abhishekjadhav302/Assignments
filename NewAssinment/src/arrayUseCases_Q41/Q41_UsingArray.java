package arrayUseCases_Q41;

public class Q41_UsingArray {
	int rollNo;
	String name;
	String blood;
	char div;
	
	public Q41_UsingArray(int rollNo, String name, String blood, char div) {
		this.rollNo = rollNo;
		this.name = name;
		this.blood = blood;
		this.div = div;
	}
	
	public String toString() {
		return "RollNo: " + rollNo + " name: " + name + " blood: " + blood + " division: " + div;
	}
}
