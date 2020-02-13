import java.util.*;

public class Problem006
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			int n = in.nextInt();
			System.out.println(m006(n));
		}
	}

	private static long m006(int n)
	{
		long n4 = (long)Math.pow(n, 4) / 4;
		long n3 = (long)Math.pow(n, 3) / 6;
		int n2 = (int)Math.pow(n, 2) / 4;
		int n1 = (int)Math.pow(n, 1) / 6;

		return Math.abs(n4 + n3 - n2 - n1);

	}
}
