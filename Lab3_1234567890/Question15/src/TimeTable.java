
public class TimeTable {

	public static void main(String[] args) {
		// initialize a variable to store the multiplication result
		int result = 0; 
		// print the first two lines
		System.out.println("* |   1   2   3   4   5   6   7   8   9");
		System.out.println("---------------------------------------");
		// for every row
		for(int i = 1; i <= 9; ++i) {
			//print the head of the row
			System.out.print(i + " |");
			// for every column
			for(int j = 1; j <= 9; ++j) { 
				result = i * j;
				if(result < 10) {
					//result < 10, print more space to keep the table shape 
					System.out.print("   " + result);
				} else {
					System.out.print("  " + result);
				}
			}
			System.out.println();
		}
	}

}
