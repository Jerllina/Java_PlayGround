
public class Motorcycle {
	private Wheel frontWheel;
	private Wheel backWheel;
	private String color;
	private int gasoline;
	
	//constructor
	public Motorcycle(String color,int gasoline) {
		//a motorcycle is created with a front wheel and a back wheel.
		this.frontWheel = new Wheel();
		this.backWheel = new Wheel();
		this.color = color;
		this.gasoline = gasoline;

	}
	public String getColor() {
		return color;
	}
	public int getGasoline() {
		return gasoline;
	}
	// The addGasoline method adds gasoline to the motorcycle: 
	//if the gasoline argument of the method is positive then the gasoline is added to the
	// motorcycle and the method returns true; if the gasoline argument is zero
	// or negative then the amount of gasoline in the motorcycle does not change
	// (it is not possible to add a zero or negative amount of gasoline to the
	// motorcycle) and the method returns false.
	public boolean addGasoline(int gasoline) {
		if(gasoline>0) {
			this.gasoline+=gasoline;
			return true;
		}else {
			return false;
		}
	}
	// Every time someone drives the motorcycle, the motorcycle consumes two
	// liters of gasoline (if the motorcycle has at least two liters of gasoline;
	// otherwise nothing changes).
	public void drive() {
		if(gasoline>=2) {
			gasoline-=2;
		}
	}
	//accident=front wheel becomes flat
	public void accident() {
		frontWheel.setFlat();
	}
	//repair=change a new front wheel
	public void repair() {
		frontWheel=new Wheel();
	}
	//if the motorcycle has no gasoline then the maximum
	// speed of the motorcycle is zero; if the motorcycle has gasoline but one or
	// both of its wheels are flat then the maximum speed of the motorcycle is 10;
	// if the motorcycle has gasoline and none of its wheels are flat then the
	// maximum speed of the motorcycle is 100.
	public int getMaxSpeed() {
		if(gasoline>0) {
			if(frontWheel.isFlat() || backWheel.isFlat()) {
				return 10;
			}else {
				return 100;
			}
		}else {
			return 0;
		}
	}
	//test
	public static void testMotorcycle() {
		// Test for constructor.
		Motorcycle m = new Motorcycle("blue", 4);
		// Test for getColor.
		System.out.println(m.getColor() == "blue");
		// Test for getGasoline.
		System.out.println(m.getGasoline() == 4);
		// Tests for addGasoline.
		System.out.println(m.addGasoline(2) == true);
		System.out.println(m.getGasoline() == 6);
		System.out.println(m.addGasoline(0) == false);
		System.out.println(m.getGasoline() == 6);
		System.out.println(m.addGasoline(-2) == false);
		System.out.println(m.getGasoline() == 6);
		// Tests for drive. 
		m.drive();
		System.out.println(m.getGasoline() == 4);
		m.drive();
		System.out.println(m.getGasoline() == 2);
		m.drive();
		System.out.println(m.getGasoline() == 0);
		m.drive();
		System.out.println(m.getGasoline() == 0);
		// Tests for getMaxSpeed, accident, and repair together.
		m.addGasoline(2);
		System.out.println(m.getMaxSpeed() == 100);
		m.accident();
		System.out.println(m.getMaxSpeed() == 10);
		m.repair();
		System.out.println(m.getMaxSpeed() == 100);
		m.drive(); // No gasoline left now.
		System.out.println(m.getMaxSpeed() == 0);
		m.accident(); // No gasoline and a flat wheel.
		System.out.println(m.getMaxSpeed() == 0); // Result must be 0, not 10!
		// At the end the color of the motorcycle is still the same.
		System.out.println(m.getColor() == "blue");
	}


}
