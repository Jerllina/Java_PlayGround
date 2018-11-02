
public class Student {
	private String name;
	private Animal pet;

	public Student(String name, Animal pet) {
		this.name = name;
		this.pet = pet;
	}
	public String getName() {
		return name;
	}
	public Animal getPet() {
		return pet;
	}
	public static void testStudent() {
		Cat c = new Cat("Meow", 2.0);
		Student s0 = new Student("Philippe", c);
		System.out.println(s0.getName() == "Philippe");
		System.out.println(s0.getPet() == c);

		// Creating a new student with a dog as pet:
		Dog d = new Dog("Woof", 2.0);
		Student s1 = new Student("Mr. Li", d);
		System.out.println(s1.getName() == "Mr. Li");
		System.out.println(s1.getPet() == d);

		//use an Animal object as a pet:
		Animal a = new Animal("Blob", 5.0);
		Student s2 = new Student("Ms. Chen", a);
		System.out.println(s2.getName() == "Ms. Chen");
		System.out.println(s2.getPet() == a);
	}
}

