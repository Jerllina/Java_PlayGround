
public class Employee {

	private int ID;
	
	public Employee(int ID) {
		this.ID=ID;
	}
	public int getID() {
		return ID;
	}
	public static void testEmployee(){
		//Testing the constructor and the getID method
		Employee em = new Employee(2333);
		System.out.println(em.getID()==2333);
		
	}
}
