
public class SumAndAverage {

	public static void main(String[] args) {
		// Initialize the accumulated sum to 0,
		//Initialize the average,the lowerbound and upperbound to sum
		int sum = 0; 
		double average; 
		int lowerbound = 1; 
		int upperbound = 100; 

		// Use  for-loop to sum from lowerbound to upperbound
		for(int number = lowerbound; number <= upperbound; number++) {
			sum += number; // same as "sum = sum + number"
		}
		// Compute average in double. 
		//Beware that int/int produces int.We need to specify it to double.
		average = (double) sum / (upperbound - lowerbound + 1);
		// Print sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);

		// 10.1 
		//while loop
		System.out.println("---- While-loop:");
		sum = 0;
		int number = lowerbound;
		while(number <= upperbound) {
			sum += number;
			number++;
		}
		// Compute average in double.
		average = (double) sum / (upperbound - lowerbound + 1);
		// Print sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);

		// 10.2 
		//do-while loop
		System.out.println("---- Do-while:");
		sum = 0; // Reset sum
		number = lowerbound;
		do {
			sum += number;
			number++;
		} while(number <= upperbound);
		// Compute average in double. 
		average = (double) sum / (upperbound - lowerbound + 1);
		// Print sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);

		// 10.3 
		//Sum from 111 to 8899
		System.out.println("---- Sum from 111 to 8899:");
		// Reset variables: sum, lowerbound, upperbound
		sum = 0;
		lowerbound = 111;
		upperbound = 8899;
		number = lowerbound;
		do {
			sum += number;
			number++;
		} while(number <= upperbound);
		// Compute average in double. 
		average = (double) sum / (upperbound - lowerbound + 1);
		// Print sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
	}

}
