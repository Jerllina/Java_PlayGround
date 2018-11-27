
// The class Ostrich derives from the class Bird.
public class Ostrich extends Bird {
	// The constructor for Ostrich takes as argument the name of the
	// ostrich.  The name and the number of eggs 10 are then given to the
	// constructor for the base class Bird.  The constructor of the Bird
	// class will then give the name to the constructor of the Animal
	// class, which will store it in the 'name' instance variable of the
	// Animal class.  The constructor of the Bird class will then store the
	// number of eggs 10 into the 'numOfEggs' instance variable of the Bird
	// class.
	// The constructor for Ostrich itself does not do anything since all the
	// work is done by the constructor for the parent (base) class Bird
	// and the constructor of the grandparent (base of base) class Animal.
	public Ostrich(String name) {
		super(name, 10);
	}
	// We know that an ostrich cannot fly, so we can write code for
	// the canFly method.  This method overrides the abstract canFly
	// method which is inherited by the Ostrich class from the Bird class
	// (which itself inherits it from the Animal class).
	@Override
	public boolean canFly() {
		return false;
	}
	// We know that an ostrich is dangerous, so we can write code for
	// the isDangerous method.  This method overrides the abstract
	// isDangerous method which is inherited by the Ostrich class from
	// the Bird class.
	@Override
	public boolean isDangerous() {
		return true;
	}

	// Since the Ostrich class is not abstract, we can create objects from
	// the Ostrich class, and therefore we can test all the methods in the
	// class (including the getName method which is inherited from the
	// Animal class and the getLegs and getNumOfEggs methods which are
	// inherited from the Bird class).
	public static void testOstrich() {
		Ostrich o = new Ostrich("Ossie");
		// The getName method is inherited from Bird, which inherits it
		// from Animal.
		// The getLegs method is inherited from Bird, which overrides
		// the abstract getLegs method inherited by Bird from Animal.
		// The getNumOfEggs method is inherited from Bird.
		// The canFly method is from Ostrich, which overrides the abstract
		// canFly method inherited from Bird, which inherits it from Animal.
		System.out.println(o.getName() == "Ossie");
		System.out.println(o.getLegs() == 2);
		System.out.println(o.getNumOfEggs() == 10);
		System.out.println(o.canFly() == false);
		System.out.println(o.isDangerous() == true);
	}
}

