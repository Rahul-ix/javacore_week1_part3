package multilevel_inheritance;

public class Cat extends Dog {
	void Catnoise() {
		System.out.println("mew mew");
	}

	//multilevel inheritance Cat extends Dog extends Animal
	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		c.Catnoise();
		c.eating();
		
		c.Dognoise();
		c.eating();
	}
}
