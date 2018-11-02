
public class Cat extends Animal {
	// The constructor for the Cat class gives both the name and weight
	// to the constructor of the Animal base class.  The constructor of
	// the Cat class itself does nothing, because the Cat class does not
	// have instance variables anymore.
	public Cat(String name, double weight) {
		super(name, weight);
	}
	// Increases the weight of the Cat by 1.0.
	public void feed() {
		// The setWeight and getWeight methods are inherited from Animal.
		this.setWeight(this.getWeight() + 1.0);
	}
	//test
	public static void testCat() {
		Cat c = new Cat("Meow", 2.0);

		// The getName and getWeight methods are inherited from Animal.
		System.out.println(c.getName() == "Meow");
		System.out.println(c.getWeight() == 2.0);
		c.feed();
		// The name is still the same but the weight increased by 1.0:
		System.out.println(c.getName() == "Meow");
		System.out.println(c.getWeight() == 3.0);
		// The setWeight method is inherited too.
		c.setWeight(2.0);
		System.out.println(c.getName() == "Meow");
		System.out.println(c.getWeight() == 2.0);
	}
}


