import java.util.Scanner;

public class BalancedArray 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] tests = new int[keyboard.nextInt()];
		
		for (int i = 0; i < tests.length; i++)
			tests[i] = keyboard.nextInt();
		
		for (int i = 0; i < tests.length; i++)
		{
			int half = tests[i]/2;
			if ((half-1)%2 == 1)
			{
				System.out.println("YES");
				
				int num = 0;
				int balance = 0;
				
				int inc = 0;
				for (int j = 0; j < half; j++)
				{
					num = 2+inc;
					inc += 2;
					balance = balance + num;
					System.out.print(num + " ");	
				}
				
				inc = 0;
				for (int j = 0; j < half-1; j++)
				{
					num = 1+inc;
					inc += 2;
					balance = balance - num;
					System.out.print(num + " ");
				}
				
				System.out.println(balance);
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
