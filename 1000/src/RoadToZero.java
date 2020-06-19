import java.util.Scanner;

public class RoadToZero 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int t = keyboard.nextInt();
		
		for (int i = 0; i < t; i++)
		{
			long x = keyboard.nextInt();
			long y = keyboard.nextInt();
			long a = keyboard.nextInt();
			long b = keyboard.nextInt();
			
			long amount;
			if (a*(x+y) < a*(Math.abs(x-y)) + b*(Math.min(x, y)))
				amount = a*(x+y);
			else
				amount = a*(Math.abs(x-y)) + b*(Math.min(x, y));
			System.out.println(amount + "");
		}
	}
}
