
public class Animal extends LivingThing {
	private double weight;

	public Animal(String name, double weight) {
		super(name);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public static void testAnimal() {
		Animal a = new Animal("Blob", 2.0);
		
		// The method getName is inherited from LivingThing.
		// The methods getWeight and setWeight come from Animal itself.
		System.out.println(a.getName() == "Blob");
		System.out.println(a.getWeight() == 2.0);
		a.setWeight(3.0);
		System.out.println(a.getName() == "Blob");
		System.out.println(a.getWeight() == 3.0);
	}
}
