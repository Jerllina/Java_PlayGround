
public class Car {
	private String name;
	private Door[] doors;

	public Car(String name, int numberOfDoors) throws BadCarException {
		this.name = name;
		// Trying to create a car with less than one door should throw a
		// BadCarException.
		if(numberOfDoors < 1) {
			throw new BadCarException("A car must have at least one door!");
		} else {
			// Create an array for the numberOfDoors doors of the car.
			// Java arrays are objects so you have to use 'new'!
			doors = new Door[numberOfDoors];
			// Create each door and connect it to the array.
			// doors.length is the same as numberOfDoors.
			// We must use a for loop, not an enhanced for loop, because we
			// are modifying the content of the 'doors' array (in other words,
			// we are modifying the value of each array element doors[i]).
			// By default a door is closed when it is created (see the
			// constructor of the Door class above) so there is no need to
			// explicitly close the doors here...
			for(int i = 0; i < doors.length; i++) {
				doors[i] = new Door();
			}
		}
	}
	// Use an enhanced for loop to loop over each door in the array and
	// print a message telling whether the door is open or closed.  We can
	// use an enhanced loop because the doors array is not modified.
	public void listDoors() {
		for(Door d: doors) {
			if(d.isOpen()) {
				System.out.println(name + ": door is open");
			} else {
				System.out.println(name + ": door is closed");
			}
		}
	}
	// Use an enhanced for loop to loop over each door in the array and
	// count the door if it is currently open.  We can use an enhanced for
	// loop because the doors array is not modified.
	public int countOpenDoors() {
		int total = 0;
		for(Door d: doors) {
			if(d.isOpen()) {
				total++;
			}
		}
		return total;
	}
	// Open the door specified by doorNumber.
	public void openOneDoor(int doorNumber) throws BadDoorException {
		// Check that the door exists:
		if(1 <= doorNumber && doorNumber <= doors.length) {
			// Array indexes go from 0 to doors.length - 1 but doorNumber
			// is between 1 and doors.length so we have to be careful to
			// subtract 1 from doorNumber before using it as an array index
			// to open the corresponding door.
			doors[doorNumber - 1].open();
		} else {
			throw new BadDoorException("Door " + doorNumber + " does not exist!");
		}
	}
	
	// Use an enhanced for loop to loop over each door in the array and change
	// closed doors into open doors and open doors into closed doors.
	// We can use an enhanced for loop because the doors array is not modified.
	public void changeAllDoors() {
		for(Door d: doors) {
			if(d.isOpen()) {
				d.close();
			} else {
				d.open();
			}
		}
	}
	
	// Replace the door specified by doorNumber with a new door.
	public void replaceDoor(int doorNumber) throws BadDoorException {
		// Check that the door exists:
		if(1 <= doorNumber && doorNumber <= doors.length) {
			// Array indexes go from 0 to doors.length - 1 but doorNumber
			// is between 1 and doors.length so we have to be careful to
			// subtract 1 from doorNumber before using it as an array index
			// to open the corresponding door.
			doors[doorNumber - 1] = new Door();
		} else {
			throw new BadDoorException("Door " + doorNumber + " does not exist!");
		}
	}
	
	// Replace numOfDoorsToReplace doors of the car with new doors.
	// We need to modify the doors array so we must use a normal for loop,
	// not an enhanced for loop.
	public void replaceManyDoors(int numOfDoorsToReplace) {
		for(int i = 0; i < numOfDoorsToReplace; i++) {
			doors[i] = new Door();
		}
	}
	// Add two new doors to the car.  To do this we must change the
	// whole doors array itself with a new bigger array, then move all the
	// existing doors from the old array to the new bigger array, and then
	// add two new doors to the new bigger array.
	public void expandCar() {
		// Defining a local variable to point to the new bigger array of doors:
		Door[] newDoors;
		// newDoors points to a completely new array of doors which is
		// bigger than the existing array of doors:
		newDoors = new Door[doors.length + 2];
		// Now we modify the elements of the new array so that they point
		// to the same existing doors indicated by the existing array of
		// doors.  This essentially moves all the existing doors from the
		// existing array of doors to the new array of doors (which is
		// bigger, so it always works).  We need to use a normal for loop
		// (not an enhanced for loop) because we are modifying the content
		// of the new array of doors.
		for(int i = 0; i < doors.length; i++) {
			newDoors[i] = doors[i];
		}
		// Now add the two new doors to the new bigger array of doors:
		newDoors[newDoors.length - 2] = new Door();
		newDoors[newDoors.length - 1] = new Door();
		// Finally replace the whole existing array of doors with the new
		// bigger array of doors.  The old array of doors then does not have
		// a name anymore and will be garbage collected by the Java system
		// (in other words, the memory reserved for the old array of doors
		// will be freed and can then be re-used later for something else).
		doors = newDoors;
	}
	
	//test
	public static void testCar() {
		// Trying to create a car with the wrong number of doors:
		try {
			Car brokencar = new Car("Broken", 0);
		} catch(BadCarException ex) {
			// We can use the == operator here to compare strings because both strings
			// (the one stored inside the exception object, and the one used directly
			// in the test itself) are constant strings.  The string stored inside the
			// exception object and returned as result by the getMessage method is a
			// constant string because it is written directly in the code of the
			// Car constructor above.
			System.out.println(ex.getMessage() == "A car must have at least one door!");
		}
			// Create a good car.
		Car c = null;
		try {
			c = new Car("Biggy", 7);
		} catch(BadCarException ex) {
			System.out.println("BUG! This must never happen!");
		}
		// Prints 7 lines of output, each with the car's name and the fact
		// that the door is closed.
		// This method returns void and does not change the car object,
		// so there is no result or change that we can test directly, we
		// can only look at the printed output and make sure it is correct...
		c.listDoors();
		// When the car is created all the doors are closed (by default).
		System.out.println(c.countOpenDoors() == 0);
		// Trying to open a nonexistent door:
		try {
			c.openOneDoor(0);
		} catch(BadDoorException ex) {
			// We must use the equals method to compare the strings, not the ==
			// operator, because the string stored inside the exception object
			// is constructed dynamically at runtime using the + operator in
			// the openOneDoor method above.
			System.out.println(ex.getMessage().equals("Door 0 does not exist!"));
		}
		// Trying to open a nonexistent door again:
		try {
			c.openOneDoor(8);
		} catch(BadDoorException ex) {
			// We must use the equals method to compare the strings, not the ==
			// operator, because the string stored inside the exception object
			// is constructed dynamically at runtime using the + operator in
			// the openOneDoor method above.
			System.out.println(ex.getMessage().equals("Door 8 does not exist!"));
		}
		// Opening door 3
		try {
			c.openOneDoor(3);
		} catch(BadDoorException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(c.countOpenDoors() == 1);
		// and 5:
		try {
			c.openOneDoor(5);
		} catch(BadDoorException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(c.countOpenDoors() == 2);
		
		// Prints 7 lines of output, each with the car's name and the fact
		// that two doors are open and five are closed.
		c.listDoors();
		// Change all the closed doors into open doors and vice versa:
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 5);
		// Prints 7 lines of output, each with the car's name and the fact
		// that five doors are open and two are closed.
		c.listDoors();
		// Change all the closed doors into open doors and vice versa, again:
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 2);
		// Prints 7 lines of output, each with the car's name and the fact
		// that two doors are open and five are closed.
		c.listDoors();
		
		// Trying to replace a nonexistent door:
		try {
			c.replaceDoor(0);
		} catch(BadDoorException ex) {
			// We must use the equals method to compare the strings, not the ==
			// operator, because the string stored inside the exception object
			// is constructed dynamically at runtime using the + operator in
			// the replaceDoor method above.
			System.out.println(ex.getMessage().equals("Door 0 does not exist!"));
		}
		// Trying to replace a nonexistent door again:
		try {
			c.replaceDoor(8);
		} catch(BadDoorException ex) {
			// We must use the equals method to compare the strings, not the ==
			// operator, because the string stored inside the exception object
			// is constructed dynamically at runtime using the + operator in
			// the replaceDoor method above.
			System.out.println(ex.getMessage().equals("Door 8 does not exist!"));
		}
		// Replace door number 5 (which is currently open) with a
		// completely new door (which is closed by default when created).
		try {
			c.replaceDoor(5);
		} catch(BadDoorException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(c.countOpenDoors() == 1);
		// Prints 7 lines of output, each with the car's name and the fact
		// that 1 door is open and six are closed.
		c.listDoors();
		
		// Open all doors again:
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 7);
		// Prints 7 lines of output, each with the car's name and the fact
		// that all doors are open.
		c.listDoors();
		// Replace four doors (which are currently open) with new doors
		// (which are closed by default when created):
		c.replaceManyDoors(4);
		System.out.println(c.countOpenDoors() == 3);
		// Prints 7 lines of output, each with the car's name and the fact
		// that four doors are closed and three are open.
		c.listDoors();
		// Trying to replace more doors than the car has.  This will
		// replace all 7 existing car doors (with array indexes from 0 to 6)
		// with new doors, then raise an ArrayIndexOutOfBoundsException when
		// trying to replace the 8th door (at array index 7, which does not
		// exist).  We can catch this exception though, so that this test does
		// not kill the program...
		try {
			c.replaceManyDoors(20);
		} catch(ArrayIndexOutOfBoundsException ex) {
			// The message inside an ArrayIndexOutOfBoundsException simply indicates
			// the index which was outside the bounds of the array, in this case 7
			// (since our array has 7 doors, with array indexes from 0 to 6).
			// We must use the equals method because obviously the string "7" which is
			// stored inside the exception object is only generated at runtime by
			// Java, since Java cannot know in advance that our program is going
			// to try to use an object which is past the end of the array).
			System.out.println(ex.getMessage().equals("7"));
		}
		// There was an exception, but just before the exception happened
		// all the existing doors were actually replace with new doors (which
		// are closed by default), which we can check:
		System.out.println(c.countOpenDoors() == 0);
		// Prints 7 lines of output, each with the car's name and the fact
		// that all doors are closed.
		c.listDoors();
	}
		

		
		
		

}