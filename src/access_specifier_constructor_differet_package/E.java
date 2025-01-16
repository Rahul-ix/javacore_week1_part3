package access_specifier_constructor_differet_package;

import access_specifier_constructor.F;

public class E extends F {

	public static void main(String[] args) {
		E e = new E();//non sub class protected constructor
//		F f = new F();//inheriting is not possible
	}
}
