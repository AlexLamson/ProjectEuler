import java.util.ArrayList;

public class Prob037
{
	public static ArrayList<Long> primes = new ArrayList<Long>();
	public static long goalTruncs = 11, truncs = 0, truncSum = 0;

	public static void main(String[] args)
	{
		//this proves that the isTruncatable method works
//		primes.add(3L);
//		primes.add(7L);
//		primes.add(37L);
//		primes.add(379L);
//		primes.add(3797L);
//		primes.add(7973L);
//		primes.add(797L);
//		primes.add(973L);
//		primes.add(97L);
//		primes.add(73L);
//		System.out.println(isTruncatable(3797L));
//		System.exit(0);

		long startTime = System.currentTimeMillis();

		primes.add(2L);

		int numPrimes = 1;
		long i = 3L;
		while(truncs != goalTruncs)
		{
			System.out.println("Now checking: "+i+" truncs found: "+truncs+" truncSum: "+truncSum);

			if(isNewPrime(i))
			{
				primes.add(i);
				if(i > 8 && isTruncatable(i))
				{
					truncs++;
					truncSum += i;
				}
			}

			i+=2;
		}

		long endTime = System.currentTimeMillis();
		long runTime = endTime - startTime;
		System.out.println(truncSum+"\nRuntime of "+runTime+" milliseconds");
	}

	public static boolean isTruncatable(long num)
	{
		String numString = num+"";
		for(int i = 1; i < numString.length(); i++)
		{
			if(!isAPrime(Long.parseLong(numString.substring(i))))
			{
				//System.out.println("1 broke with "+numString.substring(i));
				return false;
			}
		}

		numString = revString(numString);

		for(int i = 0; i < numString.length(); i++)
		{
			if(!isAPrime(Long.parseLong(numString.substring(i))))
			{
				//System.out.println("2 broke with "+numString.substring(i));
				return false;
			}

		}

		return true;
	}

	public static String revString(String str)
	{
		String strSave = "";
		for(int i = str.length()-1; i >= 0; i--)
			strSave += str.charAt(i);
		return strSave;
	}

	public static boolean isAPrime(long testNum)
	{
		for(int i = 0; i < primes.size(); i++)
			if(testNum == primes.get(i))
				return true;
		return false;
	}

	public static boolean isNewPrime(long testNum)
	{
		for(int i = 0; i < primes.size(); i++)
			if(testNum % primes.get(i) == 0)
				return false;
		return true;
	}
}
