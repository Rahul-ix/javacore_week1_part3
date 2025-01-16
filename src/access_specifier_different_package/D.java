package access_specifier_different_package;

import access_specifier.B;

public class D extends B {

	public static void main(String[] args) {
//		B b = new B();
//		System.out.println(b.x);
//		b.test1(); not accessable default you cannot use outside package
		
		/*
		 * but you can perform protected only it is subclass
		 */
		

		
//		D d = new D();
//		System.out.println(d.y);
//		d.test2();
		
		//if it is public you can access different,same packages whether it is-sub or non-sub class
		
		B b1=new B();//non-sub class
		System.out.println(b1.z);
		b1.test3();
		
		D d1=new D();//sub class
		System.out.println(d1.z);
		d1.test3();
		
		
		
		
		
		
		
		
		
		
		
	}
}
