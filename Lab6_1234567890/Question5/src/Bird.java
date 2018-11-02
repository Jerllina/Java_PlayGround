
public class Bird extends Animal {
	private double altitude;
	// The constructor for the Bird class gives both the name and weight
	// to the constructor of the Animal base class.  The constructor of
	// the Bird class itself only takes care of the altitude, because
	// altitude is the only instance variable of the Bird class.
	public Bird(String name, double weight, double altitude) {
		super(name, weight);
		this.altitude = altitude;
	}
	public double getAltitude() {
		return altitude;
	}
	public static void testBird() {
		Bird b = new Bird("Twitter", 0.5, 200.5);

		// The methods getName and getWeight are inherited from Animal.
		// The method getAltitude comes from the Bird class itself.
		System.out.println(b.getName() == "Twitter");
		System.out.println(b.getWeight() == 0.5);
		System.out.println(b.getAltitude() == 200.5);
	}
}
