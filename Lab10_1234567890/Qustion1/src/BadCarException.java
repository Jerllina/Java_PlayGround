// Exception class for trying to create a car with the wrong number of doors.
public class BadCarException extends Exception{
	public BadCarException(String msg) {
		super(msg);
	}
}
