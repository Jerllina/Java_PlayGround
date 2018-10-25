
public class Start {
	public static String check(Student someStudent) {
		if(someStudent.isSleeping()) {
			return "sweet dreams";
		} else {
			return "need coffee";
		}
	}
	public static void main(String[] args) {
		Student.testStudent();
		Chicken.testChicken(); 
		
		// Test the 'check' method using a Student.
		Student s = new Student(1234567890);
		System.out.println(check(s) == "need coffee");
		s.fallAsleep();
		System.out.println(check(s) == "sweet dreams");
}
}