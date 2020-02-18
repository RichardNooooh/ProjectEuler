public class test
{
	public static void main(String[] args)
	{
		int result_a = -1, result_b = -1;
		boolean found = false;
		for (int b = 408; b > 2; b--)
		{
			for (int a = 1; a < b; a++)
			{
				if (-a * b + 1000 * (a + b) == 500_000)
				{
					result_a = a;
					result_b = b;
					found = true;
					break;
				}
			}

			if (found)
				break;
		}

		System.out.println(result_a + " " + result_b);
	}
}

