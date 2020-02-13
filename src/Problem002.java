import java.util.*;

public class Problem002
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		ArrayList<Long> fibSeq = new ArrayList<Long>();
		fibSeq.add(1L);
		fibSeq.add(2L);

		for (int i = 0; i < t; i++)
		{
			long n = in.nextLong();
			System.out.println(m002(n, fibSeq));
		}
	}

	//DYNAMIC PROGRAMMING WOOOO
	private static long m002(long n, ArrayList<Long> fibSeq)
	{
		long result = -1;

		//have already calculated fibonacci sequence up to n
		if (n <= fibSeq.get(fibSeq.size() - 1))
			result = addEvensUpToN(n, fibSeq);
		else
		{
			boolean reachedN = false;
			while (!reachedN)
			{
				long f1 = fibSeq.get(fibSeq.size() - 1);
				long f2 = fibSeq.get(fibSeq.size() - 2);
				long f0 = f1 + f2;
				fibSeq.add(f0);

				if (f0 >= n)
				{
					reachedN = true;
					result = addEvensUpToN(n, fibSeq);
				}

			}
		}

		return result;
	}

	private static long addEvensUpToN(long n, ArrayList<Long> fibSeq)
	{
		int currentFibSize = fibSeq.size() - 1;
		long sum = 0;
		boolean reachedN = false;
		int i = 1;
		while (!reachedN)
		{
			long currentFib;
			if (i < currentFibSize && (currentFib = fibSeq.get(i)) <= n)
			{
				sum += currentFib;
				i += 3;
			}
			else
				reachedN = true;
		}
		return sum;
	}

}

