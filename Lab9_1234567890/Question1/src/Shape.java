
// The Shape class must be abstract because the area and resize
// methods are abstract.
public abstract class Shape {
	private double x;
	private double y;

	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	// The move method moves the central point of the shape by the
	// amounts dx and dy.
	public void move(double dx, double dy) {
		x += dx;
		y += dy;
	}
	// The area method is abstract because we do not know how to compute
	// the area of some unknown shape.
	public abstract double area();
	// The resize method is abstract because we do not know how to
	// resize some unknown shape.
	public abstract void resize(double newSize) throws Exception,BadRadiusException;
	// The testShape method is empty because we cannot create objects
	// from the Shape class, since it is abstract.
	public static void testShape() {
	}
}
