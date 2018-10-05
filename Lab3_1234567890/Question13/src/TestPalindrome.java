import java.util.Scanner;

public class TestPalindrome {
	public static void main(String[] args) {
		System.out.print("Enter a String: ");
		Scanner in = new Scanner(System.in);
		
		String inStr = in.next(); // read string
		String lowStr = inStr.toLowerCase(); // convert to lowercase

		int fIdx = 0, bIdx = inStr.length() - 1; // forward & backward indexes
		char fChar, bChar; // forward & backward characters
		while(fIdx < bIdx) {
			fChar = lowStr.charAt(fIdx);
			bChar = lowStr.charAt(bIdx);
			if(fChar != bChar) {
				System.out.println("\"" + inStr + "\" is not a palindrome");
				return;
			} else { 
				// match, change index
				fIdx++;
				bIdx--;
			}
		}
		System.out.println("\"" + inStr + "\" is a palindrome");
	}



}
