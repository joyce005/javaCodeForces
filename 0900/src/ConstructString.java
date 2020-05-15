import java.util.Scanner;

public class ConstructString 
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
			char[] letters = new char[tests[i][2]];
			char alphabet = 'a';
			for (int c = 0; c < letters.length; c++)
				letters[c] = alphabet++;
			
			String s = "";
			int loop = 0;
			for (int sc = 0; sc < tests[i][0]; sc++)
			{
				s = s + letters[loop++];
				if (loop == letters.length)
					loop = 0;
			}
			
			System.out.println(s);
		}
	}
}
