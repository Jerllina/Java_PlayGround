
// The Rectangle class derives from the Shape class.
public class Rectangle extends Shape {
	private double width;
	private double length;

	// x and y are given to the constructor of the base class Shape.
	public Rectangle(double x, double y, double width, double length) {
		super(x, y);
		this.width = width;
		this.length = length;
	}
	// Overriding the abstract area method inherited from Shape.
	public double area() {
		return width * length;
	}
	public void resize(double newSize) {
		this.width = newSize;
		this.length = newSize;
	}
	/**
	// Overriding the abstract resize method inherited from Shape.
	// Resizing a rectangle changes both its width and length to be newSize.
	public void resize(double newSize) {
		this.width = newSize;
		this.length = newSize;
	}
	// Overloading the resize method so that the width and length can be
	// resized without having to be equal.
	// This method does not override anything.
	public void resize(double newWidth, double newLength) {
		this.width = newWidth;
		this.length = newLength;
	}
	**/

	public void resize(double newWidth, double newLength) throws CannotResizeException {
		this.width = newWidth;
		this.length = newLength;
	}


	// The Rectangle class is not abstract (it has code for all methods) so
	// we can test it.
	public static void testRectangle() {
		Rectangle r = new Rectangle(1.2, 3.4, 4.0, 5.0);
		// getX, getY, and move are inherited from Shape.
		// area and resize come from Rectangle itself.
		System.out.println(r.getX() == 1.2);
		System.out.println(r.getY() == 3.4);
		System.out.println(r.area() == 20.0);
		// Move the rectangle.  The area does not change.
		r.move(7.8, 9.0);
		System.out.println(r.getX() == 9.0);
		System.out.println(r.getY() == 12.4);
		System.out.println(r.area() == 20.0);
		/**
		// Resize the rectangle.  The area changes but not the position.
		r.resize(12.0);
		System.out.println(r.getX() == 9.0);
		System.out.println(r.getY() == 12.4);
		System.out.println(r.area() == 144.0);
		// Resize the rectangle again with different width and length.
		// The area changes but not the position.
		r.resize(10.0, 15.0);
		System.out.println(r.getX() == 9.0);
		System.out.println(r.getY() == 12.4);
		System.out.println(r.area() == 150.0);
		**/
		// Resize the rectangle again with different width and length.
		// The area changes but not the position.
		try {
			r.resize(10.0, 15.0);
		} catch(CannotResizeException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(r.getX() == 9.0);
		System.out.println(r.getY() == 12.4);
		System.out.println(r.area() == 150.0);
	}



	
}
