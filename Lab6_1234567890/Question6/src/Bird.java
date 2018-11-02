
public class Bird extends Animal {
	private double altitude;
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
