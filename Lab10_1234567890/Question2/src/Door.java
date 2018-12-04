
public class Door {
	private boolean isOpen;
	public Door() {
		// The default state of a door when it is created is to be closed.
		isOpen = false;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void open() {
		isOpen = true;
	}
	public void close() {
		isOpen = false;
	}
	public static void testDoor() {
		Door d = new Door();
		// Checking that the door is closed after it has been created:
		System.out.println(d.isOpen() == false);
		// Closing a closed door
		d.close();
		System.out.println(d.isOpen() == false);
		// Opening a closed door
		d.open();
		System.out.println(d.isOpen() == true);
		// Opening an open door
		d.open();
		System.out.println(d.isOpen() == true);
		// Closing an open door
		d.close();
		System.out.println(d.isOpen() == false);
	}
}
