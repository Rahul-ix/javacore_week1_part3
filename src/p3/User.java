package p3;


//import p1.A;
//import p2.A; it will collids p1.A

public class User  {

	public static void main(String[] args) {
		
		p1.A u1 = new p1.A();//p1 package
		u1.login();
		
		p2.A u2 = new p2.A();//p2 package
		u2.logut();
		
	}
}
