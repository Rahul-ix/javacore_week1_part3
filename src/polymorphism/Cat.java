package polymorphism;

public class Cat extends Dog {

	/*
	 * polymorphism:we develop features such that it can take more than one form
	 * poly-many , morphism-form--->manyform
	 * 
	 * overriding-we can altering/chaning the logic of inherited method in child/sub-class
	 * we denoted as @Override it is checks wheteher method is overrided or not
	 * note: child class method modifer should be same or highier compared to parent class method
	 */
	@Override //runtime exception
	public void noise() {
		System.out.println("mew mew");
		
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.eating();
		
		System.out.println("========================");
		
		Cat c = new Cat();
		c.noise();
		c.eating();
	}
}
