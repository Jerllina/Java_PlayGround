
public class Circle extends Shape {
	private double radius;
	
	//x and y are given to the constructor of the base class Shape
	public Circle(double x,double y,double radius) {
		super(x,y);
		this.radius=radius;
	}
	//overriding the area method inherited from Shape.
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	//test
	public static void testCircle() {
		Circle c = new Circle(1.2, 3.4, 4.0);
		// getX and getY are inherited from Shape.
		// area comes from Circle itself.
		System.out.println(c.getX() == 1.2);
		System.out.println(c.getY() == 3.4);
		System.out.println(c.area() == Math.PI * 16.0);
	}

	
}
