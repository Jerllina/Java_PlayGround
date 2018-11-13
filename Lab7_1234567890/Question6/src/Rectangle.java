
public class Rectangle extends Shape {
	private double width;
	private double length;

	// x and y are given to the constructor of the base class Shape.
	public Rectangle(double x, double y, double width, double length) {
		super(x, y);
		this.width = width;
		this.length = length;
	}
	// Overriding the area method inherited from Shape.
	@Override
	public double area() {
		return width * length;
	}
	public static void testRectangle() {
		Rectangle r = new Rectangle(1.2, 3.4, 4.0, 5.0);
		// getX and getY are inherited from Shape.
		// area comes from Rectangle itself.
		System.out.println(r.getX() == 1.2);
		System.out.println(r.getY() == 3.4);
		System.out.println(r.area() == 20.0);
	}
}
