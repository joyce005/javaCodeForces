import java.util.Scanner;

public class IchihimeTriangle 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[][] tests = new int[keyboard.nextInt()][4];
		
		for (int i = 0; i < tests.length; i++)
			for (int j = 0; j < 4; j++)
				tests[i][j] = keyboard.nextInt();
		
		for (int i = 0; i < tests.length; i++)
		{
			int b = tests[i][1];
			int c = tests[i][2];
			
			System.out.println(b + " " + c + " " + c);
		}
	}
}
