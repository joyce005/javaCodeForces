import java.util.Scanner;

public class KanaDragonQuestGame 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[][] tests = new int[keyboard.nextInt()][3];
		
		for (int i = 0; i < tests.length; i++)
		{
			tests[i][0] = keyboard.nextInt();
			tests[i][1] = keyboard.nextInt();
			tests[i][2] = keyboard.nextInt();
		}
		
		for (int i = 0; i < tests.length; i++)
		{
			int h = tests[i][0];
			int n = tests[i][1];
			int m = tests[i][2];
			
			if (h <= m*10)
				System.out.println("YES");
			else
			{
				for (int j = 0; j < n; j++)
					h = h/2+10;
				h -= m*10;
				
				if (h <= 0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}
