
public class Mushroom {
	private String color;

	public Mushroom(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	// The isEdible method of the Mushroom class returns a boolean
	// indicating whether the mushroom can be eaten or not: 
	// just prints a message "Do not eat this!" and returns false (because the isEdible
	// method must return a boolean).
	public boolean isEdible() {
		System.out.println("Do not eat this!");
		return false;

	}
	//test
	public static void testMushroom() {
		Mushroom m = new Mushroom("blue");
		System.out.println(m.getColor() == "blue");
		System.out.println(m.isEdible() == false); // Message printed too.
	}
}
