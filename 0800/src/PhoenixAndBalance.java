import java.util.Scanner;

public class PhoenixAndBalance 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] tests = new int[keyboard.nextInt()];
		
		for (int i = 0; i < tests.length; i++)
			tests[i] = keyboard.nextInt();
		
		for (int i = 0; i < tests.length; i++)
		{
			int a = 0, b = 0;
			int power = tests[i];
			
			a = a + (int)Math.pow(2, (double)power);
			power--;
			
			for (int terms = 0; terms < tests[i]/2; terms++)
				b = b + (int)Math.pow(2, (double)power--);
			
			for (int terms = 0; terms < tests[i]/2-1; terms++)
				a = a + (int)Math.pow(2, (double)power--);
			
			System.out.println(a-b + "");
		}
	}
}
