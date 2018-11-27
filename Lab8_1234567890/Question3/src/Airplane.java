
public class Airplane implements Flyer{
	private String name;
	public Airplane(String name) {
		this.name=name;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public boolean canFly() {
		return true;
	}
	// Airplanes are never dangerous.
	@Override
	public boolean isDangerous() {
		return false;
	}

	public static void testAirplane() {
		Airplane a = new Airplane("Aircar");
		System.out.println(a.getName() == "Aircar");
		System.out.println(a.canFly() == true);
		System.out.println(a.isDangerous() == false);
	}

}
