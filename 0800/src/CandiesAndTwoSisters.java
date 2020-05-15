import java.util.Scanner;

public class CandiesAndTwoSisters 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] tests = new int[keyboard.nextInt()];
		
		for (int i = 0; i < tests.length; i++)
			tests[i] = keyboard.nextInt();
		
		for (int i = 0; i < tests.length; i++)
		{
			int n = tests[i];
			int distributions;
			
			if (n > 2)
				if (n%2 == 0)
					distributions = tests[i]/2-1;
				else
					distributions = tests[i]/2;
			else
				distributions = 0;
			
			System.out.println(distributions + "");
		}
	}
}
