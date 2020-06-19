import java.util.*;

public class AlternatingSubsequence 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for (int i = 0; i < t; i++)
		{
			long[] a = new long[scan.nextInt()];
			for (int j = 0; j < a.length; j++)
				a[j] = scan.nextLong();
				
			long num = a[0];
			long sum = 0;
			
			for (int j = 1; j < a.length; j++)
			{
				if (a[j]*num > 0)
				{
					if (a[j] > num)
						num = a[j];
				}
				else
				{
					sum += num;
					num = a[j];
				}
			}
			sum += num;
	
			System.out.println(sum+"");
		}
	}
}
