import java.util.Scanner; 
 
public class SumOfRoundNumbers 
{	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] tests = new int[keyboard.nextInt()];
		
		for (int i = 0; i < tests.length; i++)
			tests[i] = keyboard.nextInt();
		
		for (int testIndex = 0; testIndex < tests.length; testIndex++)
		{
			String summands = "";
			int numSummands = 0;
			int placeValue = 1;
			
			for (int i = tests[testIndex]; i > 0; i /= 10)
			{
				if (i%10 != 0)
				{
					summands = summands + i%10*placeValue + " ";
					numSummands++;
				}
				placeValue *= 10;
			}
			
			System.out.println(numSummands + "");
			System.out.println(summands);
		}
	}
}