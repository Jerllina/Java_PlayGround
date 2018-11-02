
public class Start {
	public static void main(String[] args) {
		// Unit tests
		Animal.testAnimal();
		Cat.testCat();
		Dog.testDog();
		Student.testStudent();

		// System tests, to test both classes together.
		Cat c = new Cat("Meow", 2.0);
		Student s0 = new Student("Philippe", c);
		System.out.println(s0.getPet().getName() == "Meow");
		System.out.println(s0.getPet().getWeight() == 2.0);
		s0.getPet().setWeight(3.0);
		System.out.println(s0.getPet().getName() == "Meow");
		System.out.println(s0.getPet().getWeight() == 3.0);
		
		// Creating a new student with a dog as pet:
		Dog d = new Dog("Woof", 2.0);
		Student s1 = new Student("Mr. Li", d);
		System.out.println(s1.getPet().getName() == "Woof");
		System.out.println(s1.getPet().getWeight() == 2.0);
		s1.getPet().setWeight(3.0);
		System.out.println(s1.getPet().getName() == "Woof");
		System.out.println(s1.getPet().getWeight() == 3.0);

		// use an Animal object as a pet:
		Animal a = new Animal("Blob", 5.0);
		Student s2 = new Student("Ms. Chen", a);
		System.out.println(s2.getPet().getName() == "Blob");
		System.out.println(s2.getPet().getWeight() == 5.0);
		s2.getPet().setWeight(3.0);
		System.out.println(s2.getPet().getName() == "Blob");
		System.out.println(s2.getPet().getWeight() == 3.0);
	}
}
