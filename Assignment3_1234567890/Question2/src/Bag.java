
public class Bag {
	private Mushroom mushroom;	
	//constructor
	public Bag(Mushroom mushroom) {
		
	}
	
	public Mushroom getMushroom() {
		return this.mushroom;
	}
	
	//test
	public static void testBag() {
		BoletusRubroflammeus br1 = new BoletusRubroflammeus();
		//create a bag with this boletus rubroflammeus in it.
		//upcast from BoletusRubroflammeus to Mushroom.
		Bag bag = new Bag(br1); 
		//get the mushroom from the bag
		Mushroom m = bag.getMushroom();
		//store it into a local variable called br2 of type BoletusRubroflammeus.
		// Downcast mandatory
		BoletusRubroflammeus br2 = (BoletusRubroflammeus)m;
		//check
		System.out.println(br1 == br2);

	}
}
