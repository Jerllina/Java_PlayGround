
// The class Bird derives from the class Animal.
// The class must be abstract because it does not have any code for
// the canFly method (see below).
public abstract class Bird extends Animal implements Flyer{
	private int numOfEggs;
	// The constructor for Bird takes as argument the name of the bird
	// and the number of eggs the bird has.  The name is then given to
	// the constructor of the base class Animal.  The constructor for
	// Animal will then store this name into the name instance variable
	// of the Animal.
	// The constructor for Bird itself then stores the number of eggs
	// into the numOfEggs instance variable of the Bird class.
	public Bird(String name, int numOfEggs) {
		super(name);
		this.numOfEggs = numOfEggs;
	}
	public int getNumOfEggs() {
		return numOfEggs;
	}
	// We know that a bird always has 2 legs, so we can write code for
	// the getLegs method.  This method overrides the abstract getLegs
	// method which is inherited by the Bird class from the Animal class.
	@Override
	public int getLegs() {
		return 2;
	}
	// Some birds (like magpies) can fly and some birds (like ostriches)
	// cannot fly.  So we do not know whether the canFly method of
	// some bird should return true or false: it depends on what precise
	// kind of bird we are talking about.  Since we do not know what the
	// code of the canFly method should return, we cannot write any code
	// for the canFly method of a Bird.
	//
	// There are two ways to express this in Java.
	//
	// The first way is to override the abstract canFly method inherited
	// from Animal with another abstract canFly method.  Like this:
	//
	//@Override
	//public abstract boolean canFly();
	//
	// This works perfectly well (you can uncomment the line of code
	// above and compile and run your program to check that it does
	// work), but it is a bit complicated and is not very useful: we are
	// just overriding the inherited abstract method with another
	// abstract method which is exactly the same!
	//
	// So the second way is much simpler: we simply write no code at all.
	// The Bird class then inherits the abstract canFly method from the
	// Animal class and that's all.  Later the classes derived from Bird
	// will directly override the abstract canFly method that Bird inherits
	// from Animal.
	//
	// In both cases (whether you override the inherited abstract canFly
	// method with another abstract canFly method, or whether you just do
	// nothing) the Bird class is missing some code: it does not have any
	// code for the canFly method.  Therefore the Bird class itself must
	// be abstract.

	// The Bird class is abstract, which means we cannot create Bird
	// objects from this class.  Since we cannot create objects from
	// this class, there is nothing to test.  This makes sense, because
	// this class Bird does not have code for the canFly method, and it
	// is not possible to test methods which do not have any code.
	// Some birds are dangerous and some birds are not dangerous.
		// Since the Bird class can represent any bird, we don't know
		// whether the bird is dangerous or not.  Since we don't know
		// whether isDangerous should return true or false, we make the
		// isDangerous method abstract.
	@Override
	public abstract boolean isDangerous();

	public static void testBird() {
		// Bird b = new Bird("Twitter", 3); // This does not work!
	}
}
