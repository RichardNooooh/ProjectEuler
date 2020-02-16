import java.util.*;

public class Problem010
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] testCases = new int[t];

		int largestN = -1;
		for (int i = 0; i < t; i++)
		{
			int n = in.nextInt();
			if (n > largestN)
				largestN = n;

			testCases[i] = n;
		}

		m010(testCases, largestN);
	}

	private static void m010(int[] testCases, int largestN)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		ArrayList<Long> sumOfPrimes = new ArrayList<Long>();

		sieveOfEratosthenes(primes, sumOfPrimes, largestN);

		for (int n : testCases)
		{
			if (n == 1)
				System.out.println("0");
			else
			{
				int size = sumOfPrimes.size();
				int i = 0;
				boolean foundSum = true;
				while (i < size && foundSum)
				{
					long curPrime = primes.get(i);
					if (curPrime == n || i == size - 1)
					{
						System.out.println(sumOfPrimes.get(i));
						foundSum = false;
					}
					else if (curPrime > n)
					{
						System.out.println(sumOfPrimes.get(i - 1));
						foundSum = false;
					}
					i++;
				}
			}
		}
	}

	private static void sieveOfEratosthenes(ArrayList<Integer> list, ArrayList<Long> sum, int n)
	{
		boolean prime[] = new boolean[n+1];

		for(int p = 2; p*p <=n; p++)
		{
			if(prime[p] == false)
			{
				for(int i = p * p; i <= n; i += p)
					prime[i] = true;
			}
		}

		long prevSum = 0;
		for(int i = 2; i <= n; i++)
		{
			if(prime[i] == false)
			{
				list.add(i);
				long thisSum = i + prevSum;
				sum.add(thisSum);
				prevSum = thisSum;
			}
		}
	}
}
