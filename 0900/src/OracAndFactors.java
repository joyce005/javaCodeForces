import java.util.Scanner;

public class OracAndFactors 
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
			int n = tests[i][0];
			int k = tests[i][1];
			
			if (n%2 == 0)
				System.out.println(n + 2*k + "");
			else
				System.out.println(n + OracAndFactors.f(n) + 2*(k-1) + "");
		}
	}
	
	public static int f(int n)
	{
		for (int i = 3; i*i <= n; i += 2)
			if (n%i == 0)
				return i;
		
		return n;
	}
}
