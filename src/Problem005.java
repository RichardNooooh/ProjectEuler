import java.util.*;

public class Problem005
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			int n = in.nextInt();
			System.out.println(multiply(sieveOfEratosthenes(n), n));

		}
	}

	//TODO edit this to be dynamically programmed.
	/**
	 * Lists the prime numbers below a given value n
	 */
	private static ArrayList<Integer> sieveOfEratosthenes(int n)
	{
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++)
		{
			if (prime[p] == true)
			{
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}

		ArrayList<Integer> out = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++)
			if (prime[i] == true)
				out.add(i);

		return out;
	}

	/**
	 * Return the maximum number whose factors consist of only i
	 */

	private static int maxOfPrime(int i, int n)
	{
		int out = 0;
		int initialI = i;
		while (i <= n)
		{
			out = i;
			i *= initialI;
		}

		return out;
	}

	/**
	 * Return the product of the "max" primes
	 */

	private static int multiply(ArrayList<Integer> list, int max)
	{
		int product = 1;
		for (int i = 0; i < list.size(); i++)
			product *= maxOfPrime(list.get(i), max);
		return product;
	}
}
