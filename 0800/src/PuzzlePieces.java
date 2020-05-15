import java.util.Scanner;

public class PuzzlePieces 
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
		{
			if (tests[i][0] > 2 && tests[i][1] > 1)
				System.out.println("NO");
			else if (tests[i][1] > 2 && tests[i][0] > 1)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
