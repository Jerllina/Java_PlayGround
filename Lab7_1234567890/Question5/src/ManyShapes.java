import java.util.ArrayList;

public class ManyShapes {
	private ArrayList allShapes;
	
	public ManyShapes() {
		this.allShapes=new ArrayList();
	}
	// Upcast from Shape to Object.
	public void addShape(Shape s) {
		allShapes.add(s);
	}
	
	public void listAllShapes() {
		//method 1
		for(int i = 0; i < allShapes.size(); i++) {
			Object o = allShapes.get(i);
			Shape s = (Shape)o; // Downcast from Object to Shape.
			System.out.println("Shape has area " + s.area());
		}
		//method 2, a little bit shorter:
		for(int i = 0; i < allShapes.size(); i++) {
			System.out.println("Shape has area " + ((Shape)allShapes.get(i)).area());
		}
		//method 3, using an enhanced for loop:
		for(Object o: allShapes) {
			System.out.println("Shape has area " + ((Shape)o).area());
		}
	}
	//test
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
