
public class Boletus extends Mushroom {
	// The Boletus class has a private integer instance variable
	// price that describes the price of 1 Kg of boletus.
	private int price;
	// The constructor for the Boletus class takes the boletus¡¯s
	// color and the boletus¡¯s price as arguments.
	public Boletus(String color, int price) {
		super(color);
		this.price = price;
	}
	//get Price
	public int getPrice() {
		return this.price;
	}
	//is edible.
	@Override
	public boolean isEdible() {
		return true;
	}
	
	//test
	public static void testBoletus() {
		
		Boletus b = new Boletus("blue", 3);
		// getColor is inherited from Mushroom.
		System.out.println(b.getColor() == "blue");
		System.out.println(b.getPrice() == 3);
		System.out.println(b.isEdible() == true);
		
	}

}
