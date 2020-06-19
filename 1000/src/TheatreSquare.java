import java.util.Scanner;

public class TheatreSquare 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextInt();
		long m = scan.nextInt();
		long a = scan.nextInt();
		
		long side1 = (n+a-1)/a;
		long side2 = (m+a-1)/a;
		
		System.out.println(side1*side2 + "");
	}
}
