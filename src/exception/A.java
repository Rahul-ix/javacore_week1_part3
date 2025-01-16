package exception;

public class A {
/*
 * Exception: when user gives bad input/data to the application stops execution this is called exception
 * Exception handling: we handle exception by using try catch block
 * whenever error happens in try block JVM will creates excpetion object
 * and that address is sent to the catch block and then catch block supress/bypass the error
 * and further code will get executes
 */
	int p=10;
	public static void main(String[] args) {
		
		try {
		A a =null;
		System.out.println(a.p);//null pointer exception
		int x=10;
		int y=0;
		int z=x/y;//Arithamtic Exception 10/0
		
		//note that it can show the errors of first occurence see above
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
