
public class Employee {
	private int ID;
	private String position;
	private int salary;
	
	public Employee(int ID,String position) {
		if(ID < 0) {
			this.ID = 0;
		} else {
			this.ID = ID;
		}
		this.position=position;
		this.salary=30000;

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

	public static void testEmployee(){
		//Testing the constructor and the getID method
		Employee em1 = new Employee(2333,"Zhuhai");
		System.out.println(em1.getID()==2333);
		
		// Testing the 'if' test in the constructor
		Employee em2 = new Employee(-9999,"Zhuhai");
		System.out.println(em2.getID() == 0);
		Employee em3 = new Employee(0,"Zhuhai");
		System.out.println(em3.getID() == 0);
		
		//Testing the getPosition and setPosition method
		System.out.println(em1.getPosition() == "Zhuhai");
		em1.setPosition("Shenzhen");
		System.out.println(em1.getPosition() == "Shenzhen");

		// Testing the getSalary and setSalary methods
		System.out.println(em1.getSalary() == 30000);
		em1.setSalary(20000);
		System.out.println(em1.getSalary() == 20000);
	
		
	}
}
