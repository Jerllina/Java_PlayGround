
public class BoletusEdulis extends Boletus {
	// 1st constructor takes the boletus edulis¡¯s
	// color and the boletus edulis¡¯s price as arguments
	public BoletusEdulis(String color, int price) {
		super(color, price); 
	}
	//2nd constructor takes the boletus edulis¡¯s color as argument 
	//and always uses 100 as the boletus edulis¡¯s price.
	public BoletusEdulis(String color) {
		//use the first constructor.
		this(color, 100);
	}
	//test
	public static void testBoletusEdulis() {
		// Testing the first constructor.
		BoletusEdulis be1 = new BoletusEdulis("blue", 3);
		// getColor is inherited from Mushroom.
		System.out.println(be1.getColor() == "blue");
		// getPrice is inherited from Boletus.
		System.out.println(be1.getPrice() == 3);
		// isEdible is inherited from Boletus.
		System.out.println(be1.isEdible() == true);
		
		// Testing the second constructor.
		BoletusEdulis be2 = new BoletusEdulis("green");
		// getColor is inherited from Mushroom.
		System.out.println(be2.getColor() == "green");
		// getPrice is inherited from Boletus.
		System.out.println(be2.getPrice() == 100);
		// isEdible is inherited from Boletus.
		System.out.println(be2.isEdible() == true);
	}


}
