import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.print("Enter a String: ");
		Scanner in = new Scanner(System.in);
		
		// use next() to read a string
		String inStr = in.next(); 
		// obtain the length of the input string
		int inStrLen = inStr.length(); 

		System.out.print("The reverse of the String \"" + inStr + "\" is \"");
		// Use inStr.charAt(index) in a loop to extract character at "index" from inStr
		// The string's index begins at 0 from the left
		for(int i = inStrLen - 1; i >= 0; i--) { 
			// Print the string from the right to the left
			System.out.print(inStr.charAt(i));
		}
			System.out.println("\"");

		
	}

}
