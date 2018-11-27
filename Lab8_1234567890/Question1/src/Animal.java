
// The Animal class must be abstract because its two methods getLegs
// and canFly (below) are abstract.
public abstract class Animal {
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	// Different animals have different numbers of legs.  Since the
	// Animal class can represent any animal, we don't know how many legs
	// the animal has.  Since we don't know what getLegs should return
	// as a result, we make the getLegs method abstract.
	public abstract int getLegs();
	
	// Some animals can fly and some animals cannot fly.  Since the
	// Animal class can represent any animal, we don't know whether the
	// animal can fly or not.  Since we don't know whether canFly should
	// return true or false, we make the canFly method abstract.
	public abstract boolean canFly();
	
	// The Animal class is abstract, which means we cannot create Animal
	// objects from this class.  Since we cannot create objects from this
	// class, there is nothing to test.  This makes sense, because this
	// class Animal does not have code for the getLegs and canFly method,
	// and it is not possible to test methods which do not have any code.
	public static void testAnimal() {
		// Animal a = new Animal("Unknown"); // This does not work!
	}
	

	

}
