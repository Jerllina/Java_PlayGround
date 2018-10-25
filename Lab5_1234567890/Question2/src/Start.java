
public class Start {
	public static String check(Student someStudent) {
		if(someStudent.isSleeping()) {
			return "sweet dreams";
		}else {
			return "need coffee";
		}
	}
	public static void main(String[] args) {
		Student.testStudent();
		//Test the check method using  a student 
		Student s=new Student(1234567890);
		//As initially a student is awake
		System.out.println(check(s)=="need coffee");
		s.fallAsleep();
		System.out.println(check(s)=="sweet dreams");

	}

}
