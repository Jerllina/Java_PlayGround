
public class Start {
	public static void main(String[] args) {
		// Unit tests
		Cat.testCat();
		Student.testStudent();

		// System tests, to test both classes together.
		Cat c = new Cat("Meow", 2.0);
		Student s = new Student("Philippe", c);

		System.out.println(s.getPet().getName() == "Meow");
		System.out.println(s.getPet().getWeight() == 2.0);
		// Feeding the student's pet cat:
		s.getPet().feed();
		System.out.println(s.getPet().getName() == "Meow");
		System.out.println(s.getPet().getWeight() == 3.0);
	}
}
