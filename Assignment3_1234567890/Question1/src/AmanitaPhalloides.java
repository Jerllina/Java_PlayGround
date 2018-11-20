
public class AmanitaPhalloides extends Mushroom {
	// The constructor for the AmanitaPhalloides class takes no argument.
	public AmanitaPhalloides() {
		// An amanita phalloides is colored "green".
		super("green");
	}
	
	// not edible
	// not print any message though,simply returns false
	@Override
	public boolean isEdible() {
		return false;
	}
	
	//test
	public static void testAmanitaPhalloides() {
		AmanitaPhalloides a = new AmanitaPhalloides();
		// getColor is inherited from Mushroom.
		System.out.println(a.getColor() == "green");
		System.out.println(a.isEdible() == false);  // No message printed.
	}

}
