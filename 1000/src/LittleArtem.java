import java.util.Scanner;

public class LittleArtem 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for (int n = 0; n < t; n++)
		{
			int row = scan.nextInt();
			int col = scan.nextInt();

			if (row == 1)
			{
				System.out.print("BWB");
				for (int i = 0; i < col-3; i++)
					System.out.print("B");
			}
			else
			{
				for (int r = 0; r < row; r++)
				{
					for (int c = 0; c < col; c++)
						if (r == row-1 && c > 0)
							System.out.print("W");
						else
							System.out.print("B");
					System.out.println();
				}
			}
		}
	}
}
