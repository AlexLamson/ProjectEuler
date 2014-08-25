import java.util.ArrayList;

public class Prob007
{
	public static ArrayList<Long> primes = new ArrayList<Long>();
	public static long goalPrimes = 10001;
	
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		primes.add(2L);
		
		int numPrimes = 1;
		long i = 3L;
		while(true)
		{
			if(isPrime(i))
			{
				primes.add(i);
				numPrimes++;
			}
				
			i+=2;
			if(numPrimes == goalPrimes)
				break;
		}
		
		long answer = primes.get(primes.size()-1);
		
		long endTime = System.currentTimeMillis();
		long runTime = endTime - startTime;
		System.out.println(answer+"\nRuntime of "+runTime+" milliseconds");
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
