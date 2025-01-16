package single_inheritance;

public class B extends A{
//single inheritance
	
	public void test2() {
		System.out.println("test2");
	}
	public static void main(String[] args) {
		B b = new B();
		b.test1();//test1 from class A
		b.test2();//test2 same class i.e B
		
	}
}
