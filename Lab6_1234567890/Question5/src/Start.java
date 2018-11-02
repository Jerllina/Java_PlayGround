
public class Start {
	public static void main(String[] args) {
		// Unit tests
		Animal.testAnimal();		
		Bird.testBird();
		Student.testStudent();


		//  use a Bird as a pet:
		Bird b = new Bird("Twitter", 0.5, 200.5);
		Student s3 = new Student("Mr. Wang", b);
		
		System.out.println(s3.getPet().getName() == "Twitter");
		System.out.println(s3.getPet().getWeight() == 0.5);
		s3.getPet().setWeight(3.0);
		System.out.println(s3.getPet().getName() == "Twitter");
		System.out.println(s3.getPet().getWeight() == 3.0);
	}
}
