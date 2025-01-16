package access_specifier_constructor;

public class B{

	public static void main(String[] args) {
//		A a = new A(); you cannot inherit and not able to 
//      create object of class which constructor is private
		
		D d1 = new D(10);
		
	}
}
