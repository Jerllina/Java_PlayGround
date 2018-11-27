
// The class Dog derives from the class Animal.
public class Dog extends Animal {
	// The constructor for Dog takes the name of the dog as argument.
	// This name is then given to the constructor of the base class
	// Animal.  The constructor for Animal will then store this name into
	// the name instance variable of the Animal.
	// The constructor for Dog itself does not do anything since all the
	// work is done by the constructor for the base class Animal.
	public Dog(String name) {
		super(name);
	}
	// We know that a dog always has 4 legs, so we can write code for
	// the getLegs method.  This method overrides the abstract getLegs
	// method which is inherited by the Dog class from the Animal class.
	@Override
	public int getLegs() {
		return 4;
	}
	// We know that a dog does not fly, so we can write code for the canFly
	// method.  This method overrides the abstract canFly method which is
	// inherited by the Dog class from the Animal class.
	@Override
	public boolean canFly() {
		return false;
	}
	// Since the Dog class is not abstract, we can create objects from
	// the Dog class, and therefore we can test all the methods in the
	// class (including the getName method which is inherited from the
	// Animal class).
	public static void testDog() {
		Dog d = new Dog("Nice Doggy");
		// The getName method is inherited from Animal.
		// The getLegs and canFly methods come from Dog itself.
		System.out.println(d.getName() == "Nice Doggy");
		System.out.println(d.getLegs() == 4);
		System.out.println(d.canFly() == false);
	}
}
