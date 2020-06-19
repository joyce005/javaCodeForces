import java.util.Scanner;

public class Candies 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int testCases = keyboard.nextInt();
		
		for (int i = 0; i < testCases; i++)
		{
			// Get n from the input
			int n = keyboard.nextInt(); 
			// k is a minimum of 2
			int k = 2; 
			// The summation of 2^(0)...2^(k-1) is a minimum of 3
			int summation = 3;
			
			/* Remember that x = n/summation */
			
			// This while loop is skipped if 3 is evenly divided by n
			while (n%summation != 0)
				// If the while loop is used, use brute force to find 
				// a summation that can be evenly divided by n
				summation += Math.pow(2, k++); 
					// k pretty much has no cap so you can increment indefinitely
			
			// Print x
			System.out.println(n/summation + "");
		}
	}
}
