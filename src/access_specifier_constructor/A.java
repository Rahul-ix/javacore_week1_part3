package access_specifier_constructor;

public class A {

	//private constructor modifier accessable only in same  
	private A() {
		System.out.println("private constructor");
	}
	
	
	
	public static void main(String[] args) {
		A a = new A();//private constructor
	}
}
