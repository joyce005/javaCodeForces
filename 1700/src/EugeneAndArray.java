import java.util.*;
 
public class EugeneAndArray 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] a = new int[scan.nextInt()];
		
		int numGood = 0;
		for (int i = 0; i < a.length; i++)
			a[i] = scan.nextInt();
		
		boolean good = true;
		for (int i = 0; i < a.length-1; i++)
			if (a[i]*a[i+1] <= 0)
			{
				good = false;
				break;
			}
		
		if (good)
			System.out.println((long)a.length*(a.length+1)/2 + "");	
		else
		{
			long sum = 0;
			int start = 0;
			for (int i = start; i < a.length; i++)
			{
				if (a[i] == 0)
				{
					numGood += (long)(i-1-start)*(i-start)/2;
					start = i+1;
				}
				else
				{
					sum += a[i];
					if (sum == 0)
					{
						numGood += (long)(i-start)*(i-start+1)/2;
						start = i;
					}
				}
			}
			System.out.println(numGood+"");
		}
		
	}
}