
public class Student {
	private String name;
	private Cat pet;

	public Student(String name, Cat pet) {
		this.name = name;
		this.pet = pet;
	}
	public String getName() {
		return name;
	}
	public Cat getPet() {
		return pet;
	}
	//test
	public static void testStudent() {
		Cat c = new Cat("Meow", 2.0);
		Student s = new Student("Philippe", c);

		System.out.println(s.getName() == "Philippe");
		System.out.println(s.getPet() == c);
	}
}
