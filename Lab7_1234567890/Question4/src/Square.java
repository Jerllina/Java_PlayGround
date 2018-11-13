
// The Square class derives from the Rectangle class.
public class Square extends Rectangle {
	// Everything is given to the constructor of the base class
	// Rectangle.  The size of the square is both its width and length.
	public Square(double x, double y, double size) {
		super(x, y, size, size);
	}
	// The area method is inherited from Rectangle.
	public static void testSquare() {
		Square s = new Square(1.2, 3.4, 5.0);
		// getX and getY are inherited from Shape.
		// area is inherited from Rectangle.
		System.out.println(s.getX() == 1.2);
		System.out.println(s.getY() == 3.4);
		System.out.println(s.area() == 25.0);
	}
}
