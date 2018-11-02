
public class Animal {
	private String name;
	private double weight;

	public Animal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public static void testAnimal() {
		Animal a = new Animal("Blob", 2.0);

		System.out.println(a.getName() == "Blob");
		System.out.println(a.getWeight() == 2.0);
		a.setWeight(3.0);
		System.out.println(a.getName() == "Blob");
		System.out.println(a.getWeight() == 3.0);
	}
}
