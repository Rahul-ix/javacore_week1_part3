package polymorphism;

public class SendEmail {

	/*
	 * overloading:more than one same method name but different in args and data types 
	 */
	 static void sendEmail(String to) {
		System.out.println("sent "+ to);
	}
	 static void sendEmail(String to,String sub) {
		System.out.println("sent :"+ to);
		System.out.println("sub  :"+ sub);
	}
	
	public static void main(String[] args) {
		
		sendEmail("raj");
		sendEmail("divya", "welcome to team");
	}
	
}
