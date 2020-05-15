import java.util.Scanner;

public class ABTrialProblem 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[][] tests = new int[keyboard.nextInt()][2];
		
		for (int i = 0; i < tests.length; i++)
		{
			tests[i][0] = keyboard.nextInt();
			tests[i][1] = keyboard.nextInt();
		}
		
		for (int i = 0; i < tests.length; i++)
			System.out.println(tests[i][0] + tests[i][1] + "");
	}
}
