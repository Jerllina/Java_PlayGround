
// The Dot class derives from the Shape class.
public class Dot extends Shape {
	// x and y are given to the constructor of the base class Shape.
	public Dot(double x, double y) {
		super(x, y);
	}
	// Overriding the area method inherited from Shape.
	@Override
	public double area() {
		return 0.0;
	}
	@Override
	public String toString() {
		return "Dot area is " + this.area();
	}
	public static void testDot() {
		Dot d = new Dot(1.2, 3.4);
		// getX and getY are inherited from Shape.
		// area comes from Dot itself.
		System.out.println(d.getX() == 1.2);
		System.out.println(d.getY() == 3.4);
		System.out.println(d.area() == 0.0);
		System.out.println(d.toString().equals("Dot area is 0.0"));
	}
}
