
// The class Magpie derives from the class Bird.
public class Magpie extends Bird {
	// The constructor for Magpie takes as argument the name of the
	// magpie.  The name and the number of eggs 6 are then given to the
	// constructor for the base class Bird.  The constructor of the Bird
	// class will then give the name to the constructor of the Animal
	// class, which will store it in the 'name' instance variable of the
	// Animal class.  The constructor of the Bird class will then store the
	// number of eggs 6 into the 'numOfEggs' instance variable of the Bird
	// class.
	// The constructor for Magpie itself does not do anything since all the
	// work is done by the constructor for the parent (base) class Bird
	// and the constructor of the grandparent (base of base) class Animal.
	public Magpie(String name) {
		super(name, 6);
	}
	// We know that a magpie can fly, so we can write code for
	// the canFly method.  This method overrides the abstract canFly
	// method which is inherited by the Magpie class from the Bird class
	// (which itself inherits it from the Animal class).
	@Override
	public boolean canFly() {
		return true;
	}
	// We know that a magpie is not dangerous, so we can write code for
	// the isDangerous method.  This method overrides the abstract
	// isDangerous method which is inherited by the Magpie class from
	// the Bird class.
	@Override
	public boolean isDangerous() {
		return false;
	}

	// Since the Magpie class is not abstract, we can create objects from
	// the Magpie class, and therefore we can test all the methods in the
	// class (including the getName method which is inherited from the
	// Animal class and the getLegs and getNumOfEggs methods which are
	// inherited from the Bird class).
	public static void testMagpie() {
		Magpie m = new Magpie("Maggie");
		// The getName method is inherited from Bird, which inherits it
		// from Animal.
		// The getLegs method is inherited from Bird, which overrides
		// the abstract getLegs method inherited by Bird from Animal.
		// The getNumOfEggs method is inherited from Bird.
		// The canFly method is from Magpie, which overrides the abstract
		// canFly method inherited from Bird, which inherits it from Animal.
		System.out.println(m.getName() == "Maggie");
		System.out.println(m.getLegs() == 2);
		System.out.println(m.getNumOfEggs() == 6);
		System.out.println(m.canFly() == true);
		System.out.println(m.isDangerous() == false);
	}
}
