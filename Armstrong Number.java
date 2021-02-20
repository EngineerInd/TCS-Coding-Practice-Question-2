// Java program to check if a number is Armstrong 
// using command line arguments 

class GFG { 

	// Function to calculate x 
	// raised to the power y 
	public static int power(int x, long y) 
	{ 
		if (y == 0) 
			return 1; 
		if (y % 2 == 0) 
			return power(x, y / 2) * power(x, y / 2); 
		return x * power(x, y / 2) * power(x, y / 2); 
	} 

	// Function to calculate order of the number 
	public static int order(int x) 
	{ 
		int n = 0; 
		while (x != 0) { 
			n++; 
			x = x / 10; 
		} 
		return n; 
	} 

	// Function to check whether the given number is 
	// Armstrong number or not 
	public static int isArmstrong(int x) 
	{ 
		// Calling order function 
		int n = order(x); 
		int temp = x, sum = 0; 
		while (temp != 0) { 
			int r = temp % 10; 
			sum = sum + power(r, n); 
			temp = temp / 10; 
		} 

		// If satisfies Armstrong condition 
		if (sum == x) 
			return 1; 
		else
			return 0; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Check if length of args array is 
		// greater than 0 
		if (args.length > 0) { 

			// Get the command line argument and 
			// Convert it from string type to integer type 
			int num = Integer.parseInt(args[0]); 

			// Get the command line argument 
			// and check if it is Armstrong 
			int res = isArmstrong(num); 

			// Check if res is 0 or 1 
			if (res == 0) 
				// Print No 
				System.out.println("No\n"); 
			else
				// Print Yes 
				System.out.println("Yes\n"); 
		} 
		else
			System.out.println("No command line "
							+ "arguments found."); 
	} 
} 
