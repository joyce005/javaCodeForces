import java.util.Scanner;

public class FillingDiamonds 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] tests = new int[keyboard.nextInt()];
		
		for (int i = 0; i < tests.length; i++)
			tests[i] = keyboard.nextInt();
		
		for (int i = 0; i < tests.length; i++)
			System.out.println(tests[i] + "");
	}
}
