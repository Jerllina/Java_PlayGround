
// The class Pegasus derives from the class Bird.
public class Pegasus extends Bird {
	// The constructor for Pegasus takes as argument the name of the
	// pegasus.  The name and the number of eggs 6789 are then given to the
	// constructor for the base class Bird.  The constructor of the Bird
	// class will then give the name to the constructor of the Animal
	// class, which will store it in the 'name' instance variable of the
	// Animal class.  The constructor of the Bird class will then store the
	// number of eggs 6789 into the 'numOfEggs' instance variable of the Bird
	// class.
	// We can give any random number like 6789 as the number of eggs
	// because we are overriding the getNumOfEggs method below anyway, so
	// the number 6789 will never be used again.  We simply need to use
	// here some number like 6789 because the constructor of the Bird
	// class requires to get both a name and a number of eggs.
	//
	// The constructor for Pegasus itself does not do anything since all the
	// work is done by the constructor for the parent (base) class Bird
	// and the constructor of the grandparent (base of base) class Animal.
	public Pegasus(String name) {
		super(name, 6789);
	}
	// A pegasus does not lay eggs, so we need to override the
	// getNumOfEggs method which is inherited from the Bird class (which
	// would return the random number 6789 as result).  This method prints
	// the message "Pegasi do not lay eggs!" and returns zero as a result.
	@Override
	public int getNumOfEggs() {
		System.out.println("Pegasi do not lay eggs!");
		return 0;
	}
	// A pegasus has four legs, so we need to override the getLegs
	// method which is inherited from the Bird class (which always
	// returns 2).
	@Override
	public int getLegs() {
		return 4;
	}
	// We know that a pegasus can fly, so we can write code for
	// the canFly method.  This method overrides the abstract canFly
	// method which is inherited by the Pegasus class from the Bird class
	// (which itself inherits it from the Animal class).
	@Override
	public boolean canFly() {
		return true;
	}
	// Since the Pegasus class is not abstract, we can create objects from
	// the Pegasus class, and therefore we can test all the methods in the
	// class (including the getName method which is inherited from the
	// Animal class and the getLegs and getNumOfEggs methods which are
	// inherited from the Bird class).
	@Override
	public boolean isDangerous() {
		return false;
	}

	public static void TestPegasus() {
		Pegasus p = new Pegasus("Peggie");
		// The getName method is inherited from Bird, which inherits it
		// from Animal.
		// The getLegs method is from Pegasus, which overrides the getLegs
		// method inherited from Bird, which overrides the abstract
		// getLegs method inherited by Bird from Animal.
		// The getNumOfEggs method is from Pegasus, which overrides the
		// getNumOfEggs method inherited from Bird.
		// The canFly method is from Pegasus, which overrides the abstract
		// canFly method inherited from Bird, which inherits it from Animal.
		System.out.println(p.getName() == "Peggie");
		System.out.println(p.getLegs() == 4);
		System.out.println(p.getNumOfEggs() == 0); // Message printed here.
		System.out.println(p.canFly() == true);
		System.out.println(p.isDangerous() == false);
	}
}
