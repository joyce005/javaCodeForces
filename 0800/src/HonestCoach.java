import java.util.*;

public class HonestCoach 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		
		for (int t = 0; t < tests; t++)
		{
			int[] s = new int[scan.nextInt()];
			for (int i = 0; i < s.length; i++)
				s[i] = scan.nextInt();
			Arrays.sort(s);
			
			int diff = s[s.length-1] - s[0];
			for (int i = 1; i < s.length; i++)
				if ((int)Math.abs(s[i] - s[i-1]) < diff)
					diff = (int)Math.abs(s[i] - s[i-1]);
			
			System.out.println(diff+"");
		}
	}
}
