
public class CepesALaBordelaise extends BoletusEdulis {
	//constructor 
	public CepesALaBordelaise() {
		// always brown and a price of 500.
		super("brown", 500);		
	}
	
	//test
	public static void testCepesALaBordelaise() {
		CepesALaBordelaise calb = new CepesALaBordelaise();
		// getColor is inherited from Mushroom.
		System.out.println(calb.getColor() == "brown");
		// getPrice is inherited from Boletus.
		System.out.println(calb.getPrice() == 500);
		// isEdible is inherited from Boletus.
		System.out.println(calb.isEdible() == true);
	}



}
