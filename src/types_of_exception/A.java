package types_of_exception;

public class A {
/*
 * types of exception: compile-time exception(Checked exception)
 * 					   run-time exception(unchecked exception)
 * 
 * 
 *            			Throwable (class)
 *      			        |
 *            	        Exception (class)
 *                     /                \
 * compiletime exception (java)        runtime excpetion (class)
 * 
 * FileNotFoundException				Arithmatic
 * IOException                          nullpointer exception
 * Sql exception						numberformate exception
 * clone not supported					Arraysoutofbound exception eyc
 * no such file etc
 */
	int p=10;
	public static void main(String[] args) {
		
		//-------------ArithmeticException------------
		
		try {
			int x=10;
			int y=0;
			if(x%y==0) { //ArithmeticException
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("done");
		

		
		//-------NullPointerException---------
		try {
			
			A a =null;
			System.out.println(a.p);//NullPointerException
			
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("done");
		//note Exception class acts like global exception handler class,
		// it can handle any type exception occurs in project
	}
}
