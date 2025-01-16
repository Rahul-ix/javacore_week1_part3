package access_specifier;

public class C {

	public static void main(String[] args) {
		//same package
		B b1 = new B();
		System.out.println(b1.x);
		b1.test1();
	}
}
