
public class Student extends LivingThing {

	private Animal pet;

	public Student(String name, Animal pet) {
		super(name);
		this.pet = pet;
	}

	public Animal getPet() {
		return pet;
	}
	public static void testStudent() {
		
		//use an Animal object as a pet:
		Animal a = new Animal("Blob", 5.0);
		Student s2 = new Student("Ms. Chen", a);
		System.out.println(s2.getName() == "Ms. Chen");
		System.out.println(s2.getPet() == a);
		
		//use a Bird as a pet:
		Bird b = new Bird("Twitter", 0.5, 200.5);
		Student s3 = new Student("Mr. Wang", b);
		System.out.println(s3.getName() == "Mr. Wang");
		System.out.println(s3.getPet() == b);
		
		//use a Chicken as a pet
		Chicken ch = new Chicken("Cotcot");
		Student s4 = new Student("Ms. Liu", ch);
		System.out.println(s4.getName() == "Ms. Liu");
		System.out.println(s4.getPet() == ch);



	}

}
