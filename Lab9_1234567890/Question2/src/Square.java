
// The Square class derives from the Rectangle class.
public class Square extends Rectangle {
	// Everything is given to the constructor of the base class
	// Rectangle.  The size of the square is both its width and length.
	public Square(double x, double y, double size) {
		super(x, y, size, size);
	}
	// The area method is inherited from Rectangle.
	// The resize method is inherited from Rectangle.
	// Overriding the second resize method of the Rectangle class to
	// throw an exception when the new width and new length are not equal.
	@Override
	public void resize(double newWidth, double newLength) throws CannotResizeException {
		if(newWidth == newLength) {
			// Calling the other resize method of the same class, which is
			// inherited from the Rectangle class, and which will set both the
			// width and length to be the same as newWidth.
			resize(newWidth);
			// Another possible way to do this is to directly call the
			// resize method of the superclass Rectangle
			
		} else {
			throw new CannotResizeException("Cannot resize a square into a rectangle!");
		}
	}

	// The Square class is not abstract (it has code for all methods) so
	// we can test it.
	public static void testSquare() {
		Square s = new Square(1.2, 3.4, 5.0);
		// getX, getY, and move are inherited from Shape.
		// area and resize are inherited from Rectangle.
		System.out.println(s.getX() == 1.2);
		System.out.println(s.getY() == 3.4);
		System.out.println(s.area() == 25.0);
		// Move the square.  The area does not change.
		s.move(7.8, 9.0);
		System.out.println(s.getX() == 9.0);
		System.out.println(s.getY() == 12.4);
		System.out.println(s.area() == 25.0);
		// Resize the square.  The area changes but not the position.
		// Resize the square again with different width and length!
		// An exception is thrown, caught, and tested.
		try {
			s.resize(10.0, 15.0);
			System.out.println(s.getX() == 9.0); // Unreachable.
			System.out.println(s.getY() == 12.4);
			System.out.println(s.area() == 150.0);
		} catch(CannotResizeException ex) {
			System.out.println(ex.getMessage() == "Cannot resize a square into a rectangle!");
		}
		// The area and position do not change.
		System.out.println(s.getX() == 9.0);
		System.out.println(s.getY() == 12.4);
		System.out.println(s.area() ==25.0);

		// Resize the square again with equal width and length.
		// The area changes but not the position.
		try {
			s.resize(10.0, 10.0);
		} catch(CannotResizeException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(s.getX() == 9.0);
		System.out.println(s.getY() == 12.4);
		System.out.println(s.area() == 100.0);

	}
}
