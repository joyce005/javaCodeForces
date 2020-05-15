import java.util.Scanner;

public class NastyaAndRice
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[][] tests = new int[keyboard.nextInt()][5];
		
		for (int i = 0; i < tests.length; i++)
			for (int j = 0; j < 5; j++)
				tests[i][j] = keyboard.nextInt();
		
		for (int i = 0; i < tests.length; i++)
		{
			int n = tests[i][0];
			int a = tests[i][1];
			int b = tests[i][2];
			int c = tests[i][3];
			int d = tests[i][4];
			
			if ( ( (n*(a-b) >= c-d) && (n*(a-b) <= c+d) ) 
					|| ( (n*(a+b) >= c-d) && (n*(a+b) <= c+d) )
					|| ( (c-d >= n*(a-b)) && (c-d <= n*(a+b)) ) 
					|| ( (c+d >= n*(a-b)) && (c+d <= n*(a+b)) ) )
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
