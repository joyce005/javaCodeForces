import java.util.Scanner;

public class PuzzlePieces 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int size = keyboard.nextInt();
		
		int[] n = new int[size];
		int[] m = new int[size];
		
		for (int i = 0; i < size; i++)
		{
			n[i] = keyboard.nextInt();
			m[i] = keyboard.nextInt();
		}
		
		for (int i = 0; i < size; i++)
		{
			if (n[i] > 2 && m[i] > 1)
				System.out.println("NO");
			else if (m[i] > 2 && n[i] > 1)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
