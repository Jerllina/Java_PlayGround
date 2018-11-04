
public class Wheel {
	private boolean flat;
	//constructor
	//a wheel is not flat when it is created
	public Wheel() {
		this.flat=false;
	}
	public void setFlat() {
		flat=true;
	}
	public boolean isFlat() {
		return flat;
	}
	//TEST
	public static void testWheel() {
		Wheel w=new Wheel();
		System.out.println(w.isFlat() == false);
		
		w.setFlat();
		System.out.println(w.isFlat() == true);

	}
	
}
