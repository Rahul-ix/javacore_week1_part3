package access_specifier_constructor;

public class D  extends F{

	//same package sub class and non sub class
	D(int x){
		System.out.println("default constructor"+x);
	}
	
	public static void main(String[] args) {
		D d1 = new D(10);//default constructor10 
		
	}
}
