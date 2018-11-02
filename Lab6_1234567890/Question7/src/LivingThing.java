
public class LivingThing {
	private String name;

	public LivingThing(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public static void testLivingThing() {
		LivingThing l = new LivingThing("Glop");

		System.out.println(l.getName() == "Glop");
	}

}
