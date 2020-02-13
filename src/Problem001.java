import java.util.*;

public class Problem001
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			int n = in.nextInt();
			System.out.println(m001(n - 1));
		}
	}

	private static long m001(int n)
	{
		//summation limits
		int n3 = n / 3;
		int n5 = n / 5;
		int n15 = n / 15;

		//individual sums
		long sum3 = 3 * (long)n3 * (n3 + 1) / 2;
		long sum5 = 5 * (long)n5 * (n5 + 1) / 2;
		long sum15 = 15 * (long)n15 * (n15 + 1) / 2;

		return sum3 + sum5 - sum15;
	}
}
