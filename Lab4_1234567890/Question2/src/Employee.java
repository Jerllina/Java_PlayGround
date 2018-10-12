
public class Employee {
	private int ID;
	
	public Employee(int ID) {
		if(ID < 0) {
			this.ID = 0;
		} else {
			this.ID = ID;
		}

	}
	public int getID() {
		return ID;
	}
	public static void testEmployee(){
		//Testing the constructor and the getID method
		Employee em = new Employee(2333);
		System.out.println(em.getID()==2333);
		
		// Testing the 'if' test in the constructor
		Employee em2 = new Employee(-9999);
		System.out.println(em2.getID() == 0);
		Employee em3 = new Employee(0);
		System.out.println(em3.getID() == 0);

		
	}
}
