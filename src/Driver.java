
public class Driver {
	
	static String day;
	
	public Driver(String day)  {
		this.day = day;
		
	}
	public static void print() {
		System.out.println(day);
	}
	
	
	
	
	public static void main (String [] args) {
		
		Driver day = new Driver("Monday")	;
		print();
		Date.print();
		
		
	}

}
