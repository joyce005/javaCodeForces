import java.util.Scanner;

public class Square 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[][][] tests = new int[keyboard.nextInt()][2][2];
		
		for (int i = 0; i < tests.length; i++)
		{
			tests[i][0][0] = keyboard.nextInt();
			tests[i][0][1] = keyboard.nextInt();
			tests[i][1][0] = keyboard.nextInt();
			tests[i][1][1] = keyboard.nextInt();
		}
		
		for (int i = 0; i < tests.length; i++)
			if ((tests[i][0][0] == tests[i][1][0]) 
					&& (tests[i][0][1] + tests[i][1][1] == tests[i][0][0]))
				System.out.println("Yes");
			
			else if ((tests[i][0][0] == tests[i][1][1]) 
					&& (tests[i][0][1] + tests[i][1][0] == tests[i][0][0]))
				System.out.println("Yes");
			
			else if ((tests[i][0][1] == tests[i][1][0]) 
					&& (tests[i][0][0] + tests[i][1][1] == tests[i][0][1]))
				System.out.println("Yes");
			
			else if ((tests[i][0][1] == tests[i][1][1]) 
					&& (tests[i][0][0] + tests[i][1][0] == tests[i][0][1]))
				System.out.println("Yes");
			
			else
				System.out.println("No");
	}
}
