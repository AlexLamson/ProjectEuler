import java.util.ArrayList;

/*

The prime 41, can be written as the sum of six consecutive primes:
41 = 2 + 3 + 5 + 7 + 11 + 13

This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?

 */

public class Prob050
{
	public static ArrayList<Long> primes = new ArrayList<Long>();
	public static final long goalMax = 1000000L;
	
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		//find all the primes under 1 mil
		System.out.println("Generating primes...");
		primes.add(2L);
		long k = 3L;
		while(k < goalMax)
		{
			if(isPrime(k))
				primes.add(k);
			k+=2;
			
			if((k+1) % 10000 == 0)
				System.out.println("generating primes: "+((k+1)/10000)+"/100");
		}
		
		System.out.println("Checking intervals...");
		int bestLowerBound = 0;
		int bestConsecutivePrimes = 0;
		long bestSum = 0;
		for(int low = 0; low < primes.size(); low++)		//increment the lower bound
		{
			//keep adding primes until the sum is just under 1 mil
			long sum = 0;
			int highBound = 0;
			for(int i = low; sum < goalMax && i < primes.size(); i++)
			{
				highBound = i;
				sum += primes.get(i);
			}
			sum -= primes.get(highBound);
			highBound--;
			
			for(int high = highBound; high > low; high--)	//decrement the upper bound
			{
				int consecutivePrimes = high-low;
				if(consecutivePrimes < bestConsecutivePrimes)
					break;
				
				if(isPrime(sum))
				{
					//stop and log [lower bound, number of primes, sum]
					if(consecutivePrimes > bestConsecutivePrimes)
					{
						bestLowerBound = low;
						bestConsecutivePrimes = consecutivePrimes;
						bestSum = sum;
						
						break;
					}
				}
				else
				{
					//subtract highest prime added
					sum -= primes.get(high);
				}
			}
		}
		
		System.out.println("from "+primes.get(bestLowerBound)+" to "+primes.get(bestLowerBound+bestConsecutivePrimes)+" ("+bestConsecutivePrimes+" consecutive primes)");
		
		long endTime = System.currentTimeMillis();
		long runTime = endTime - startTime;
		System.out.println(bestSum+"\nRuntime of "+runTime+" milliseconds");
	}
	
	public static boolean isPrime(long testNum)
	{
		for(int i = 0; i < primes.size(); i++)
			if(testNum != primes.get(i) && testNum % primes.get(i) == 0)
				return false;
		return true;
	}
}
