public class Employee {
	private int ID;
	private String position;
	private int salary;
	private boolean playing;
	
	// This constructor calls the second one
	public Employee(int ID,String position) {
		this(ID,position,3000);
		playing=false;

	}
	public Employee(int ID,String position,int salary) {
		if(ID < 0) {
			this.ID = 0;
		} else {
			this.ID = ID;
		}
		this.position=position;
		this.salary=salary;
		playing=false;

	}
	public int getID() {
		return ID;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position=position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isPlaying() {
		return playing;
	}
	public void goToPlay() {
		playing=true;
		if(salary>100||salary==100) {
			salary=salary-100;
		}else {
			salary=0;
		}
	}
	public void goToWork() {
		playing=false;
	}
	public static void testEmployee(){
		//Testing the first constructor and the getID method
		Employee em1 = new Employee(2333,"Zhuhai");
		System.out.println(em1.getID()==2333);
		
		
		//Testing the getPosition and setPosition method
		System.out.println(em1.getPosition() == "Zhuhai");
		em1.setPosition("Shenzhen");
		System.out.println(em1.getPosition() == "Shenzhen");

		// Testing the getSalary and setSalary methods
		System.out.println(em1.getSalary() == 3000);
		em1.setSalary(200);
		System.out.println(em1.getSalary() == 200);
		
		//Testing the second constructor
		Employee em4 = new Employee(3222,"Hongkong",1000);
		System.out.println(em4.getID()==3222);
		System.out.println(em4.getPosition() == "Hongkong");
		System.out.println(em4.getSalary() == 1000);
		
		// Testing the isSleeping, goToSleep, and wakeUp methods
		// As part of these tests we need to check that the grade
		// correctly changes when the students goes to sleep and
		// when the student wakes up.
		System.out.println(em1.isPlaying() == false);
		em1.goToPlay();
		System.out.println(em1.isPlaying() == true);
		System.out.println(em1.getSalary() == 100);
		em1.goToWork();
		System.out.println(em1.isPlaying() == false);
		System.out.println(em1.getSalary() == 100);

		// The 'if' statement of the goToPlay method has two
		// branches: one for the salary>100 and salary=100 cases, and one
		// for the salary<100 case.  We tested the first
		// branch just above, so here we test the other branch
		em1.setSalary(90);
		em1.goToPlay();
		System.out.println(em1.isPlaying() == true);
		System.out.println(em1.getSalary() == 0);
		em1.goToWork();
		System.out.println(em1.isPlaying() == false);
		System.out.println(em1.getSalary() == 0);

		// Testing the 'if' test in the second constructor
		Employee em5 = new Employee(-3333,"London",90000);
		System.out.println(em5.getID() == 0);
		Employee em6 = new Employee(0,"Zhuhai",90000);
		System.out.println(em6.getID() == 0);
	
		
	}
}