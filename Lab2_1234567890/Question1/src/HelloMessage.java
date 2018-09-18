import java.util.Scanner;

public class HelloMessage {

	public static void main(String[] args) {
		// hint for input
		System.out.println("Input your name: ");
		//create a scanner attached to System.in
		Scanner input=new Scanner(System.in);
		//read a line of the input value
		String name=input.nextLine();
		//print message on screen
		System.out.println("Hello,"+name+"!");

	}

}
