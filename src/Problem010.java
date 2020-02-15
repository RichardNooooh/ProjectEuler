import java.util.*;

public class Problem010
{
	public static void main(String[] args)
	{
//		Scanner in = new Scanner(System.in);
//		int t = in.nextInt();
//		int[] testCases = new int[t];
//
//		int largestN = -1;
//		for (int i = 0; i < t; i++)
//		{
//			int n = in.nextInt();
//			if (n > largestN)
//				largestN = n;
//
//			testCases[i] = n;
//		}
//
//		m010(testCases, largestN);

		ArrayList<Integer> list = sieveOfEratosthenes(2000000);
		long sum = 0;
		for (int i : list)
			sum += i;
		System.out.println(sum + " sum: " + list.size());
	}

//	private static void m010(int[] testCases, int largestN)
//	{
//		ArrayList<Integer> primes = new ArrayList<Integer>();
//		sieveOfEratosthenes(primes, largestN);
//		System.out.println(primes);
//
////		ArrayList<Long> sumOfPrimes = new ArrayList<Long>();
////		sumOfPrimes.add(2L);
//
//
//
//	}

//	private static int sumOfPrimes(ArrayList<Long> sums, ArrayList<Integer> addends)
//	{
//		if (addends.size() > sums.size())
//		{
//			int index = sums.size() - 1;
//			int limit = addends.size() - 1;
//
//			while (index < limit)
//			{
//				sums.add(sums.get(index) + addends.get(index));
//
//				index++;
//			}
//
//		}
//
//
//
//		return -1;
//	}

	private static ArrayList<Integer> sieveOfEratosthenes(int n)
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

		ArrayList<Integer> out = new ArrayList<Integer>();

		for(int i = 2; i <= n; i++)
			if(prime[i] == false)
				out.add(i);

		return out;
	}
}
