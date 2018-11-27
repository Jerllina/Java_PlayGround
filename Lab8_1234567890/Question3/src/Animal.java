
public abstract class Animal {
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public abstract int getLegs();
	
	public abstract boolean canFly();
	
	// The Animal class is abstract, which means we cannot create Animal
	// objects from this class.  Since we cannot create objects from this
	// class, there is nothing to test.  This makes sense, because this
	// class Animal does not have code for the getLegs and canFly method,
	// and it is not possible to test methods which do not have any code.
	public static void testAnimal() {
		// Animal a = new Animal("Unknown"); 
	}
}