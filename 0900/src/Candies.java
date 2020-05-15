import java.util.Scanner;

public class Candies 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] tests = new int[keyboard.nextInt()];
		
		for (int i = 0; i < tests.length; i++)
			tests[i] = keyboard.nextInt();
		
		for (int i = 0; i < tests.length; i++)
		{
			int n = tests[i];
			int k = 1;
			int sumPow2 = 3;
			
			while (n%sumPow2 != 0)
				sumPow2 += Math.pow(2, ++k);
			
			System.out.println(n/sumPow2 + "");
		}
	}
}
