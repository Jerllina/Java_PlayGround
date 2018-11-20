
public class BoletusRubroflammeus extends Boletus {
	//constructor
	public BoletusRubroflammeus() {
		super("red", 0);
	}
	// not edible
	@Override
	public boolean isEdible() {
		return false;
	}
	//test
	public static void testBoletusRubroflammeus() {
		BoletusRubroflammeus br = new BoletusRubroflammeus();
		// getColor is inherited from Mushroom.
		System.out.println(br.getColor() == "red");
		// getPrice is inherited from Boletus.
		System.out.println(br.getPrice() == 0);
		// isEdible is from BoletusRubroflammeus itself.
		System.out.println(br.isEdible() == false);
	}

}
