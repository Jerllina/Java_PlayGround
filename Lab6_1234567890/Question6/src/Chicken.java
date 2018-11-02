
public class Chicken extends Bird{
	/*
	The constructor for the Chicken class needs to give a name, a
	weight, and an altitude to the constructor of the base class Bird,
	which takes three arguments.  So here the constructor for the
	Chicken class always uses the values 5.0 and 0.0 for the weight
	and altitude given to the constructor of the Bird class.  The
	name given to the constructor of the Bird class is the same name
	given to the constructor of the Chicken class.
	The constructor of the Bird class will then give the name and
	weight of 5.0 to the constructor of the Animal class (see the
	constructor of the Bird class).  The constructor of the
	Animal class, which takes two arguments, will then store the name
	and weight into the name and weight instance variables of the
	Animal class.  The altitude 0.0 given as third argument to the
	constructor of the Bird class by the constructor of the Chicken
	class will be stored by the constructor of the Bird class into
	the altitude instance variable of the Bird class.
	The constructor of the Chicken class itself does nothing, because
	the Chicken class does not have any instance variable.
	*/
	public Chicken(String name) {
		super(name, 5.0, 0.0);
	}
	public static void testChicken() {
		Chicken c = new Chicken("Cotcot");

		// The methods getName, getWeight, and setWeight are inherited from Animal.
		// The method getAltitude is inherited from Bird.
		System.out.println(c.getName() == "Cotcot");
		System.out.println(c.getWeight() == 5.0);
		System.out.println(c.getAltitude() == 0.0);
		c.setWeight(2.0);
		System.out.println(c.getName() == "Cotcot");
		System.out.println(c.getWeight() == 2.0);
		System.out.println(c.getAltitude() == 0.0);
	}

}
