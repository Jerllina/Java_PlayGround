
public class Dog extends Animal {
	// The constructor for the Dog class gives both the name and weight
	// to the constructor of the Animal base class.  The constructor of
	// the Dog class itself does nothing, because the Dog class does not
	// have instance variables anymore.
	public Dog(String name, double weight) {
		super(name, weight);
	}
	// Increases the weight of the Dog by 2.0.
	public void feed() {
		// The setWeight and getWeight methods are inherited from Animal.
		this.setWeight(this.getWeight() + 2.0);
	}
	public static void testDog() {
		Dog d = new Dog("Woof", 2.0);

		// The getName and getWeight methods are inherited from Animal.
		System.out.println(d.getName() == "Woof");
		System.out.println(d.getWeight() == 2.0);
		d.feed();
		// The name is still the same but the weight increased by 2.0:
		System.out.println(d.getName() == "Woof");
		System.out.println(d.getWeight() == 4.0);
		// The setWeight method is inherited too.
		d.setWeight(2.0);
		System.out.println(d.getName() == "Woof");
		System.out.println(d.getWeight() == 2.0);
	}
}
