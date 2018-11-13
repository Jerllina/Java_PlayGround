
import java.util.ArrayList;

public class ManyShapes {
	private ArrayList allShapes;
	
	public ManyShapes() {
		this.allShapes = new ArrayList();
	}
	public void addShape(Shape s) {
		allShapes.add(s); // Upcast from Shape to Object.
	}
	public void listAllShapes() {
		for(Object o: allShapes) {
			if(o instanceof Circle) {
				System.out.println("Circle has area " + ((Circle)o).area());
			} else if(o instanceof Dot) {
				System.out.println("Dot has area " + ((Dot)o).area());
			} else if(o instanceof Square) { // Before Rectangle!
				System.out.println("Square has area " + ((Square)o).area());
			} else if(o instanceof Rectangle) {
				System.out.println("Rectangle has area " + ((Rectangle)o).area());
			} else if(o instanceof Shape) { // Last among shapes.
				System.out.println("Shape has area " + ((Shape)o).area());
			} else {
				System.out.println("ERROR"); // Must never happen.
			}
		}
	}
	public static void testManyShapes() {
		ManyShapes m = new ManyShapes();
		m.addShape(new Circle(1.2, 3.4, 4.0));         // Upcast from Circle to Shape.
		m.addShape(new Dot(1.2, 3.4));                 // Upcast from Dot to Shape.
		m.addShape(new Rectangle(1.2, 3.4, 4.0, 5.0)); // Upcast from Rectangle to Shape.
		m.addShape(new Shape(1.2, 3.4));
		m.addShape(new Square(1.2, 3.4, 5.0));         // Upcast from Square to Shape.
		m.listAllShapes();
	}
}

