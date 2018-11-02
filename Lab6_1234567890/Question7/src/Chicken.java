
public class Chicken extends Bird{

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