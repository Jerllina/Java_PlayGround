public class Start {
	
	public static String checkStudent(Student someStudent) {
		if(someStudent.isSleeping()) {
			return "sweet dreams";
		}else {
			return "need coffee";
		}
	}
	
	public static String checkChicken(Chicken someChicken) {
		if(someChicken.isSleeping()) {
			return "sweet dreams";
		}else {
			return "need milk";
		}
	}
	public static void main(String[] args) {
		Student.testStudent();
		Chicken.testChicken();
		
		//Test the checkStudent method using  a student 
		Student s=new Student(1234567890);
		//As initially a student is awake
		System.out.println(checkStudent(s)=="need coffee");
		s.fallAsleep();
		System.out.println(checkStudent(s)=="sweet dreams");
		
		//Test the checkChicken method using  a chicken 
		Chicken c=new Chicken(2.2);
		//As initially a student is sleeping
		System.out.println(checkChicken(c)=="sweet dreams");
		c.wakeUp();
		System.out.println(checkChicken(c)=="need milk");
		

	}

}
