import java.util.ArrayList;

//completes in about 2 minutes
public class Prob010
{
	public static ArrayList<Long> primes = new ArrayList<Long>();
	public static long goalLimit = 2000000;
	
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		primes.add(2L);
		
		int updateEvery = 5000, updateIncrement = 0;
		
		long i = 3L;
		while(true)
		{
			if(isPrime(i))
				primes.add(i);
			
			updateIncrement++;
			if(updateIncrement == updateEvery)
			{
				System.out.println("i: "+i+"\tprimes found: "+primes.size());
				updateIncrement = 0;
			}
			
			i+=2;
			if(i >= goalLimit)
				break;
		}
		
		long sum = 0;
		for(int j = 0; j < primes.size(); j++)
			sum += primes.get(j);
		
		long endTime = System.currentTimeMillis();
		long runTime = endTime - startTime;
		System.out.println(sum+"\nRuntime of "+runTime+" milliseconds");
	}
	
	public static boolean isPrime(long testNum)
	{
		boolean isPrime = true;
		for(int i = 0; i < primes.size(); i++)
		{
			if(testNum % primes.get(i) == 0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
