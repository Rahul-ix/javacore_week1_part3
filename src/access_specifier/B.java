package access_specifier;
/*
 * default modifier: you can access same class and same package and sub or non-sub-class
 * but outside package is not allowed
 */
public class B {
	
	int x=10;
	void test1() {
		System.out.println("default");
	}
	
	protected int y=20;
	protected void test2() {
		System.out.println("protected");
	}
	
	public int z=30;
	public void test3() {
		System.out.println("public");
	}

}
