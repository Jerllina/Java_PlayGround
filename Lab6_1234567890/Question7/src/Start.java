
public class Start {
	public static void main(String[] args) {
		// Unit tests
		Animal.testAnimal();		
		Bird.testBird();
		Chicken.testChicken();
		Student.testStudent();
		LivingThing.testLivingThing();
		
		//  use a Chicken as a pet:
		Chicken ch = new Chicken("Cotcot");
		Student s4 = new Student("Ms. Liu", ch);
		System.out.println(s4.getPet().getName() == "Cotcot");
		System.out.println(s4.getPet().getWeight() == 5.0);
		s4.getPet().setWeight(3.0);
		System.out.println(s4.getPet().getName() == "Cotcot");
		System.out.println(s4.getPet().getWeight() == 3.0);
		
		


	}
}

