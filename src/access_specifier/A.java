package access_specifier;
/*
 * access specifier on variavle and method
 * private : you can access same class only
 */
public class A {

	private int x=10;
	
	private void test() {
		System.out.println("private");
	}
	public static void main(String[] args) {
		
		A a1 = new A();
		System.out.println(a1.x);//same class
		a1.test();
	}
}
// class B{
//	public static void main(String[] args) {
//		 A a1 = new A();
//			System.out.println(a1.x); not same class
//			a1.test();	
//	}
//}