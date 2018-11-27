
public class Start {
	public static void main(String[] args) {
		Animal.testAnimal();
		Bird.testBird();
		Magpie.testMagpie();
		Ostrich.testOstrich();
		Pegasus.TestPegasus();
		Airplane.testAirplane();
		
		//interface test
		Flyer m=new Magpie("Maggie");
		System.out.println(m.getName()=="Maggie");
		System.out.println(m.canFly() == true);
		System.out.println(m.isDangerous() == false);

		Flyer o = new Ostrich("Ossie");
		System.out.println(o.getName() == "Ossie");
		System.out.println(o.canFly() == false);
		System.out.println(o.isDangerous() == false);

		Flyer p = new Pegasus("Peggie");
		System.out.println(p.getName() == "Peggie");
		System.out.println(p.canFly() == true);
		System.out.println(p.isDangerous() == false);
		
		Flyer a = new Airplane("Aircar");
		System.out.println(a.getName() == "Aircar");
		System.out.println(a.canFly() == true);
		System.out.println(a.isDangerous() == false);

		
		

	}
}

